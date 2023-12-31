# Write your MySQL query statement below
# select substring(trans_date) as month,country, count(id) as transaction_count,




SELECT  substring(trans_date,1,7) AS month, country, 
count(id) AS trans_count, 
SUM(CASE WHEN state = 'approved' then 1 else 0 END) AS approved_count, 
SUM(amount) AS trans_total_amount, SUM(CASE WHEN state = 'approved' then amount else 0 END) AS approved_total_amount
FROM Transactions
GROUP BY country,month;