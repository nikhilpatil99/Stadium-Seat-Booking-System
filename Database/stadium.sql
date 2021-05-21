create table admin(id serial primary key,admin_name varchar(20) not null unique,admin_pass varchar(20) not null);
create table users(id serial primary key,user_name varchar(20) not null unique,user_pass varchar(20) not null,hint varchar(50),name varchar(50) not null,email varchar(40) not null,mobnum varchar(10) unique);
create table booking(user_id int references users(id),
                     booking_id serial primary key,
                     event varchar(50) not null,
                     seat_type varchar(50) not null,
                     seat_num1 int,
                     seat_num2 int,
                     seat_num3 int,
                     seat_num4 int,
                     seat_num5 int,
                     amt bigint,status varchar(20) check(status in('Pending','Paid')),food_id serial unique);
                     
create table food_order(user_id int references booking(booking_id),order_id int references booking(food_id),
			item1 varchar(20) ,
			item2 varchar(20) ,
			item3 varchar(20) ,
			item4 varchar(20) ,
			item5 varchar(20) ,			
			amt bigint );
create table stadium(name varchar(40) primary key,city varchar(40) not null,address varchar(100) not null,phone int unique);
create table sportevent(stadium_name varchar(40) references stadium(name),event_name varchar(50) not null,start_date date not null,start_time time not null);
create table availfood(item varchar(50)unique,price int not null);

drop table users;
drop table booking;
drop table food_order;

create table platinumseat(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table royalbox(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table vipboxwest(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table vipboxeast(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table premiumseatwest(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table premiumseateast(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table corporateboxwest(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table corporateboxeast(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table interenationalwest(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table interenationaleast(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table generalwest(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));
create table generaleast(seat_num int primary key,statusofevent1 boolean default(true),statusofevent2 boolean default(true),statusofevent3 boolean default(true));

INSERT INTO platinumseat (seat_num) select * from generate_series(1,30);
INSERT INTO royalbox (seat_num) select * from generate_series(1,20);
INSERT INTO vipboxwest (seat_num) select * from  generate_series(1,20);
INSERT INTO vipboxeast (seat_num) select * from  generate_series(1,20);
INSERT INTO premiumseatwest (seat_num) select * from  generate_series(1,25);
INSERT INTO premiumseateast (seat_num) select * from   generate_series(1,25);
INSERT INTO corporateboxwest (seat_num) select * from  generate_series(1,25);
INSERT INTO corporateboxeast (seat_num) select * from  generate_series(1,25);
INSERT INTO interenationalwest (seat_num) select * from   generate_series(1,50);
INSERT INTO interenationaleast (seat_num) select * from  generate_series(1,50);
INSERT INTO generalwest (seat_num) select * from  generate_series(1,100);
INSERT INTO generaleast (seat_num) select * from   generate_series(1,100);
update  platinumseat set statusofevent1=false where seat_num=22
select statusofevent1 from  platinumseat order by seat_num;
select statusofevent1 from platinumseat where seat_num=10;
select statusofevent2 from platinumseat order by seat_num;
select * from platinumseat order by seat_num;
select * from  royalbox;
select * from  vipboxwest;
select * from  vipboxeast;
select * from  premiumseatwest;
select * from  premiumseateast;
select * from  corporateboxwest;
select * from  corporateboxeast;
select * from  interenationalwest;
select * from  interenationaleast;
select * from  generalwest;
select * from  generaleast;
drop table generaleast
Alter table generaleast DROP  COLUMN statusofevent1
Alter table generaleast add  COLUMN statusofevent1 boolean default(true)
alter table platinumseat drop column statusofevent1
Alter table platinumseat add  COLUMN statusofevent1 boolean default(true)
drop statusofevent2 from platinumseat
select * from admin;
select * from users;
select * from booking;
select * from food_order;
select * from stadium;
select * from sportevent;

update sportevent set event_name='b',start_date='2018-12-1',start_time='9:0:0' where event_name='a';

delete from food_order
insert into food_order(food_id,item1,amt) values(6,'coke*2',50);
select booking_id from booking where user_id=1;
select * from food_order where food_id=1
select booking_id,event,seat_num1,seat_num2,seat_num3,seat_num4,seat_num5,booking.amt,status from booking inner join  food_order on food_order.food_id=booking.booking_id;
select * from booking inner join food_order on food_order.food_id=booking.booking_id;
Update booking set amt=21000 where user_id=7

select * from users natural join booking;
(select name from users natural inner join booking where users.id=booking.user_id)
select booking_id,seat_num,food_id from booking;
select user_id from users where user_name='Sandeep'
select * from booking natural inner join users where users.id=booking.user_id
select max(booking_id) from booking 

insert into admin(admin_name,admin_pass) values('Admin','admin@123');
insert into admin(admin_name,admin_pass) values('Chintamani','Chintu@123');
insert into users(user_name,user_pass,hint,name,email,mobnum) values('Chintamani','Chintu@123','name@123','Chintamani Naik','n.chintamani103@gmail.com',7769041432);
update users set hint='name@123' where user_id=1;
insert into users(user_name,user_pass) values('Nikhil','nick@123');

insert into availfood values('Coke',25);
insert into availfood values('Sprite',25);
insert into availfood values('Popcorn Small',25);
insert into availfood values('Popcorn Medium',40);
insert into availfood values('Popcorn Large',55);
select * from availfood
drop table availfood

update booking set food_id=7 where booking_id=1;

delete from booking where booking_id=102;

insert into stadium values('Wankhede Stadium','Mumbai','Vinoo Mankad Rd, Church gate, Mumbai, Maharashtra 400020',1234567890);
insert into sportevent values('Wankhede Stadium','T20:India vs Australia','2018-09-20','10:00:00');
insert into sportevent values('Wankhede Stadium','ODI:India vs Australia','2018-10-20','9:00:00');

SELECT TO_CHAR(() :: DATE, 'dd/mm/yyyy');
SELECT TO_CHAR(NOW() :: DATE, 'Mon dd, yyyy');