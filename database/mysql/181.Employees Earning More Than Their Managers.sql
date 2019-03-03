select Name as 'Employee' from Employee as A where ManagerId is not null and exists( select 1 from Employee as B where B.Id=A.ManagerId and B.Salary<A.Salary )
