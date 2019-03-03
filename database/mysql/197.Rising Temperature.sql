select Id from Weather as A where exists (select 1 from Weather as B where B.Date=DATE_SUB(A.Date,INTERVAL 1 DAY) and B.Temperature<A.Temperature )
