select B.Name as Department ,A.Name as Employee,A.Salary as Salary  from Employee as A inner join Department as B on  A.DepartmentId =B.Id where exists(select 1 from Employee as C where DepartmentId =A.DepartmentId group by DepartmentId having max(Salary)=A.Salary)