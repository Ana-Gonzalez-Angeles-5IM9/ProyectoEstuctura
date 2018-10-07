drop database if exists BanApp;
create database BanApp;
use BanApp;

create table Usuario(
	user varchar(20),
    password varchar(25), 
    tipo int
);

insert into Usuario values('ana', 'popopipi', 2);
insert into Usuario values('eoropeza', 'elprof', 1);
insert into Usuario values('kevin', 'pambazodecarne', 4);
insert into Usuario values('frida', 'abortoslocos', 3);

select * from Usuario;