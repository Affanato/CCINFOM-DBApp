/*
	Queries assigned to Diane 
    - Purchasing Products
    - Sales Report
*/


/*
	Reading the Product Record to determine which products can be sold to the member based on quantity
*/
SELECT * FROM products
WHERE available_quantity > 0
ORDER BY product_id;

/*
	Recording the sales with the Member ID, Product ID, Quantity
    Replace 1, 1, 1 with proper values
*/
INSERT INTO product_purchases (member_id, product_id, quantity_sold, purchase_datetime)
VALUES (1, 1, 1, NOW()); 

/*
	Updating the available quantity whenever a product has been restocked
    Replace 2, 16 with user input
*/
UPDATE products
SET available_quantity = available_quantity + 2
WHERE product_id = 16;

/*
	Updating the available quantity whenever a product has been sold (decrease)
    Replace 2, 16 with user input
*/
UPDATE products
SET available_quantity = available_quantity - 2
WHERE product_id = 16;

/*
	All-time best-selling products and corresponding number of items sold
*/
SELECT p.product_name, SUM(pp.quantity_sold) AS total_sold
FROM product_purchases pp
JOIN products p ON pp.product_id = p.product_id
GROUP BY p.product_id, p.product_name
HAVING SUM(pp.quantity_sold) = (
    SELECT MAX(total_sold)
    FROM (
        SELECT SUM(quantity_sold) AS total_sold
        FROM product_purchases
        GROUP BY product_id
    ) AS max_sold
)
ORDER BY total_sold DESC;


/*
	Subscription Sales: Monthly report of total earnings from subscriptions.
*/
SELECT YEAR(s.subscription_start_date) AS year, MONTH(s.subscription_start_date) AS month, FORMAT(SUM(st.subscription_type_price), 2)
FROM subscriptions s
JOIN subscription_types st ON s.subscription_type_id=st.subscription_type_id
GROUP BY year, month
ORDER BY year, month;


/*
	Product Sales: Monthly report of total earnings from products
*/
SELECT YEAR(pp.purchase_datetime) AS year, MONTH(pp.purchase_datetime) AS month, FORMAT(SUM(pp.quantity_sold * p.product_price), 2) AS total_earnings
FROM product_purchases pp
JOIN products p ON pp.product_id=p.product_id
GROUP BY year, month
ORDER BY year, month;


