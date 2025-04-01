# Write your MySQL query statement below
SELECT 
TODAY.id
FROM Weather YES
CROSS JOIN Weather TODAY
WHERE DATEDIFF(TODAY.recordDate,YES.recordDate) = 1
    AND TODAY.temperature > YES.temperature;