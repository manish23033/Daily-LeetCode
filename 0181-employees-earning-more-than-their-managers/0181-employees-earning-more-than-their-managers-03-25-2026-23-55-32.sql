SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.managerId = e2.id
WHERE e1.salary IS NOT NULL
  AND e2.salary IS NOT NULL
  AND e1.salary > e2.salary;