
create table person
(
id integer not null,
name varchar(255) not null,
location varchar(225),
birth_date timestamp,
primary key(id)
);


	INSERT into person (ID, NAME, LOCATION, BIRTH_DATE)
	values(10001, 'Mike Smith', 'Falls church', sysdate());
	
	INSERT into person (ID, NAME, LOCATION, BIRTH_DATE)
	values(10002, 'Jack Wilber', 'Reston', sysdate());
	
	INSERT into person (ID, NAME, LOCATION, BIRTH_DATE)
	values(10003, 'Lisa Arron', 'Mcclean', sysdate());