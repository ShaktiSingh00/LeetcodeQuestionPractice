# # Write your MySQL query statement below
# select Students.student_id, Students.student_name, Examinations.subject_name, count(Examinations.student_id) as attended_exams
# from Students 
# join Examinations on Students.student_id = Examinations.student_id
# group by subject_name
# order by student_id;
SELECT
    Students.student_id,
    Students.student_name,
    Subjects.subject_name,
    COUNT(Examinations.student_id) AS attended_exams
FROM
    Students

CROSS JOIN Subjects 

left JOIN
    Examinations ON Students.student_id = Examinations.student_id and Subjects.subject_name = Examinations.subject_name
GROUP BY
    Students.student_id,
    Students.student_name,
    Subjects.subject_name
ORDER BY
    Students.student_id,
    Subjects.subject_name;
