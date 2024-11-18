
/*
	Queries assigned to CJ.
*/

/*
	subscription_types
*/
-- Total subscriptions per subscription type per month per year
-- WORKS!
SELECT			YEAR(s.subscription_start_date) AS year,
				MONTH(s.subscription_start_date) AS month,
				st.subscription_type_name AS subscription_type,
				COUNT(*) AS total_subscriptions
FROM 			subscriptions s
JOIN 			subscription_types st ON s.subscription_type_id = st.subscription_type_id
GROUP BY 		year, month, subscription_type
ORDER BY 		year, month, subscription_type;

-- Total revenue per subscription type per month per year
-- WORKS!
SELECT			YEAR(s.subscription_start_date) AS year,
				MONTH(s.subscription_start_date) AS month,
				st.subscription_type_name AS subscription_type,
				COUNT(*) * st.subscription_type_price AS total_revenue
FROM 			subscriptions s
JOIN 			subscription_types st ON s.subscription_type_id = st.subscription_type_id
GROUP BY 		year, month, subscription_type
ORDER BY 		year, month, subscription_type;

-- Total subscriptions per subscription type
-- WORKS!
SELECT			st.subscription_type_name AS subscription_type,
				COUNT(*) AS total_subscriptions
FROM 			subscriptions s
JOIN 			subscription_types st ON s.subscription_type_id = st.subscription_type_id
GROUP BY 		subscription_type
ORDER BY 		total_subscriptions;

-- Total revenue per subscription type
-- WORKS!
SELECT			st.subscription_type_name AS subscription_type,
				COUNT(*) * st.subscription_type_price AS total_revenue
FROM 			subscriptions s
JOIN 			subscription_types st ON s.subscription_type_id = st.subscription_type_id
GROUP BY 		subscription_type
ORDER BY 		total_revenue;

/*
	amenity_logs
*/
-- Determine the total number of usages per amenity per month per year.
-- WORKS!
SELECT			YEAR(al.usage_start_datetime) AS year,
				MONTH(al.usage_start_datetime) AS month,
				a.amenity_name,
				COUNT(*) AS total_usages
FROM			amenity_logs al
JOIN			amenities a ON al.amenity_id = a.amenity_id
GROUP BY		year, month, a.amenity_name
ORDER BY		year, month, a.amenity_name;

-- Determine the total number of usages per amenity.
-- WORKS!
SELECT			a.amenity_name, COUNT(*) AS total_usages
FROM			amenity_logs al
JOIN			amenities a ON al.amenity_id = a.amenity_id
GROUP BY		a.amenity_name
ORDER BY		total_usages;

-- Determine the total revenue per amenity per month per year.
-- WORKS!
SELECT			YEAR(al.usage_start_datetime) AS year,
				MONTH(al.usage_start_datetime) AS month,
				a.amenity_name,
				SUM(al.usage_total_price) AS total_revenue
FROM			amenity_logs al
JOIN			amenities a ON al.amenity_id = a.amenity_id
GROUP BY		year, month, a.amenity_name
ORDER BY		year, month, a.amenity_name;

-- Determine the total revenue per amenity.
-- WORKS!
SELECT			a.amenity_name, SUM(al.usage_total_price) AS total_revenue
FROM			amenity_logs al
JOIN			amenities a ON al.amenity_id = a.amenity_id
GROUP BY		a.amenity_name
ORDER BY		total_revenue;

/*
	Miscellaneous
*/
-- Determine the current subscription_type_id of a member.
-- WORKS!
-- (?) <=> (member_id)
SELECT			s.subscription_type_id
FROM			members m
JOIN			subscriptions s ON m.member_id = s.member_id
WHERE			m.member_id = '?'
AND				CURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date;

-- Determine the price of an amenity usage given subscription_type_id, amenity_id, and usage_duration_hours.
-- WORKS!
-- (?, ?, ?) <=> (usage_duration_hours, subscription_type_id, amenity_id)
SELECT			CASE
					WHEN COUNT(*) > 0 THEN 0
                    ELSE a.walk_in_price_per_hour * 1 -- ?
				END AS usage_total_price
FROM			subscription_type_amenities sta
JOIN			amenities a ON sta.amenity_id = a.amenity_id
WHERE			sta.subscription_type_id = '?'
AND				sta.amenity_id = '?';
				