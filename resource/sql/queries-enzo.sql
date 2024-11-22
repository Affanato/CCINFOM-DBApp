-- Monthly/Yearly Sales Report per Product 
SELECT 
    p.product_brand, 
    p.product_name, 
    SUM(pp.quantity_sold) AS totalQuantitySold
FROM 
    products p
JOIN 
    product_purchases pp 
ON 
    pp.product_id = p.product_id
WHERE 
    YEAR(pp.purchase_datetime) = 2023
GROUP BY 
    p.product_id, 
    p.product_brand, 
    p.product_name
ORDER BY 
    totalQuantitySold DESC, 
    p.product_brand, 
    p.product_name;

-- Most Popular Trainer per Month/Year
SELECT 
    t.trainer_id, 
    t.last_name, 
    t.first_name, 
    t.program_specialty, 
    COUNT(ts.subscription_id) AS numOfMembersTrained
FROM 
    trainers t
LEFT JOIN 
    training_sessions ts 
ON 
    t.trainer_id = ts.trainer_id 
    AND YEAR(ts.session_start_datetime) = 2024
    AND MONTH(ts.session_start_datetime) = 11
GROUP BY 
    t.trainer_id, 
    t.last_name, 
    t.first_name, 
    t.program_specialty
ORDER BY 
    numOfMembersTrained DESC, 
    t.program_specialty, 
    t.last_name, 
    t.first_name;
