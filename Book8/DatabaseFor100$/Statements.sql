select title, year from movie order by year;
select * from movie order by year;
select title, year from movie
   where year <= 1980
   order by year;
   select title, year from movie where id = 7;
   
   select lastname, firstname, title
  from movie, friend
  where movie.id = friend.movieid;
  
  select distinct lastname, firstname from friend;
  delete from movie where id = 10;
  
  update movie set price = 18.95 where id = 8;