-- # Write your MySQL query statement below
-- select activity_date as day , count(case when activity_type='open_session' then 1 else 0 end) as activity_users from Activity
-- where activity_date = '2019-07-20'
-- group by activity_date;
SELECT 
    activity_date AS day, 
    COUNT(DISTINCT user_id) AS active_users
FROM 
    Activity
WHERE 
    activity_date BETWEEN DATE_SUB('2019-07-27', INTERVAL 29 DAY) AND '2019-07-27'
GROUP BY 
    activity_date;

