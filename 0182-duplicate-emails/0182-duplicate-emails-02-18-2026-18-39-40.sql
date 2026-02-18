# Write yourMySQL query statement below
SELECT DISTINCT email AS Email
FROM Person
GROUP BY  Email
HAVING COUNT(Email) > 1; 