# Write your MySQL query statement below
-- select product_name, sum(unit) as unit from Products 
-- join Orders on Products.product_id = Orders.product_id
-- group by Orders.product_id
-- having order_date between '2020-02-01' and '2020-02-29' and sum(units) >= 100;

SELECT product_name, SUM(unit) as unit 
FROM Products 
JOIN Orders ON Products.product_id = Orders.product_id
WHERE order_date BETWEEN '2020-02-01' AND '2020-02-29' -- Assuming it's a leap year
GROUP BY Orders.product_id, product_name
HAVING SUM(unit) >= 100;
