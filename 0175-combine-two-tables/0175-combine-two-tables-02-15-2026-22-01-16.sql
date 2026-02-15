-- CREATE TABLE Person (
--     personID INT PRIMARY KEY,
--     lastName VARCHAR(100),
--     firstName VARCHAR(100)
-- );

-- CREATE TABLE Address (
--     addressID INT PRIMARY KEY,
--     personID INT,
--     city VARCHAR(100),
--     state VARCHAR(100)
-- );

SELECT 
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
ON p.personID = a.personID;
