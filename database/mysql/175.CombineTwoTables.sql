select A.FirstName,A.LastName,B.City,B.State from Person as A left join Address as B on A.PersonId=B.PersonId
