# Write your MySQL query statement below
select unique_id,name from Employees emp  left join EmployeeUNI empuni on emp.id=empuni.id ;