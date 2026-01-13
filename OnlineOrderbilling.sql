create database order_billing_db;
use order_billing_db;

create table Orders(order_id int , customer_name varchar(30), order_amount float, tax_percent float , order_date date); 

insert into Orders values(101,'Jay Onkar',893,0.8,'2026-01-12');
insert into Orders values(102,'Gaurav Chamlate',1793,1.9,'2026-01-12');
insert into Orders values(103,'om mankar',2233,3.4,'2026-01-12');

select * from Orders;
