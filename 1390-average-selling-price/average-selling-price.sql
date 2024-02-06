-- # Write your MySQL query statement below
-- SELECT  PRICES.PRODUCT_ID, ROUND(SUM(price*units)/SUM(units),2) as AVERAGE_PRICE FROM PRICES
--  JOIN  UNITSSOLD on PRICES.PRODUCT_ID = UNITSSOLD.PRODUCT_ID
-- group by PRICES.PRODUCT_ID;
SELECT 
    p.product_id,
    IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units), 2),0) AS average_price
FROM 
    Prices p
LEFT JOIN 
    UnitsSold u ON p.product_id = u.product_id 
        AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY 
    p.product_id;
