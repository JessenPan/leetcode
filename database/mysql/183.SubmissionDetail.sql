select Name as 'Customers' from Customers as A where not exists (select 1 from Orders as B where B.CustomerId=A.Id)
