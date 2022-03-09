
create database mydb;
use mydb;


create table tb1(name varchar(10),age int,city varchar(20));
create table tb2(name varchar(10),Branch varchar(20));
insert into tb1 values("sam",21,"bangalore");
insert into tb1 values("ram",24,"manglore");
insert into tb1 values("aryan",24,"hyd");
insert into tb1 values("hani",22,"mysore");
insert into tb2 VALUES("sam","ME");
insert into tb2 VALUES("hani","CS");
insert into tb2 VALUES("ram","IS");
insert into tb2 VALUES("rani","EC");
insert into tb2 VALUES("jenny","CS");
select* from tb2;
select tc.name from tb1  tc inner join tb2 t where t.name=tc.name;
select tc.name from tb1  tc left outer join tb2 t on t.name=tc.name;
select tc.name,tc,age from tb1  tc right outer join tb2 t on t.name=tc.name;
select tc.name tc,city from tb1  tc cross join tb2 t on t.name=tc.name;

select t.name,t1.age
FROM tb1 as t,tb1 as t1
where t.city=t1.city;