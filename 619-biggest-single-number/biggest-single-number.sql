-- # Write your MySQL query statement below
-- -- select num from MyNumbers
-- -- group by num
-- -- having count(num)=1
-- -- order by num desc
-- -- LIMIT 1;
-- SELECT num,
-- CASE
--     WHEN count(num) = 1 THEN num
--     WHEN count(num) =  THEN 'null'
--     ELSE 'The quantity is under 30'
-- END AS QuantityText
-- FROM MyNumbers
--  having count(num)=1
--  order by num desc
--  LIMIT 1;
SELECT MAX(num) AS num
FROM  (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) as unique_num ;
