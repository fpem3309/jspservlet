use study;
show tables;
show databases;

create table movie(
title VARCHAR(100) not null,
content VARCHAR(2000) not null,
opening_date DATE not null
);

select * from study.movie;