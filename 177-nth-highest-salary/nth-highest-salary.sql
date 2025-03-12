CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
   with cte as (select id,salary,dense_rank() over(order by salary desc) as rnk
  from Employee)
    select salary from cte 
    where rnk=n
    limit 1
  );
END
