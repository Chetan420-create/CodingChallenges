create database attendance_db;
use attendance_db;

create table Employee(emp_id int , emp_name varchar(20), department varchar(15));

create table attendance(attendance_id int , emp_id int , attendance_date date , is_present boolean);

insert into Employee values(101,'Nikhil Chaudhari','Testing');
insert into Employee values(102 , 'Aman Nikude','Finanace');

select * from Employee;

insert into attendance values(201,101,'2026-01-13',false);
insert into attendance values(201,102,'2026-01-13',true);

select * from attendance;


