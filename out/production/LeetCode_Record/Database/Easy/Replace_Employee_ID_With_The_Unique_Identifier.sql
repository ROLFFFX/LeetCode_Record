-- # Write your MySQL query statement below
SELECT E2.unique_id, E1.name
FROM Employees E1 left join EmployeeUNI E2 on
E1.id = E2.id;
