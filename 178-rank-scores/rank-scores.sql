# Write your MySQL query statement below
-- select score, count(auto)  from Scores
-- order by score desc;

# Write your MySQL query statement below
SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank' from Scores;