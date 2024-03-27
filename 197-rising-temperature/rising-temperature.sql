# Write your MySQL query statement below
select w1.id from Weather w1
join Weather w2 
where w1.temperature > w2.temperature and w1.recordDate = w2.recordDate + interval 1 day;