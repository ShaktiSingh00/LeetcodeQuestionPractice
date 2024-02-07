# Write your MySQL query statement below
-- select employee_id from Employees
-- where salary < 30000 and manager_id = ( select employee_id from Employees where salary < 30000 and manager_id != employee_id);

SELECT employee_id 
FROM Employees
WHERE salary < 30000  AND manager_id not IN (SELECT  employee_id FROM Employees)
order by employee_id;
