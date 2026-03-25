SELECT e1.name AS Employee
FROM Employee e1
LEFT JOIN Employee e2
ON e1.managerId = e2.id
WHERE e2.id IS NOT NULL
  AND e1.salary > e2.salary;