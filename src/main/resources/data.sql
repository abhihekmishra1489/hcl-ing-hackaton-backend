insert into product_group (product_group_id,product_group_name) VALUES (1,'Savings');
insert into product_group (product_group_id,product_group_name) VALUES (2,'Mortgage');
insert into product_group (product_group_id,product_group_name) VALUES (3,'Payments');

insert into product_details (product_details_id,product_name,product_group_id) VALUES (1,'Banking saving mortgage',2);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (2,'Interest-only',2);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (3,'Annuity',2);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (4,'Linear',2);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (5,'Payments account',3);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (6,'Debit card',3);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (7,'Quarterly limit',3);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (8,'Continuously limit',3);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (9,'Orange savings account',1);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (10,'Child savings account',1);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (11,'Savings account for Unicef',1);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (12,'Bonus interest account',1);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (13,'Savings deposit',1);
insert into product_details (product_details_id,product_name,product_group_id) VALUES (14,'Green savings deposit',1);


insert into customer_product_details(customer_id,account_balance,age,customer_name) VALUES (1,'20000',40,'Ram');
insert into customer_product_details(customer_id,account_balance,age,customer_name) VALUES (2,'300000',60,'Shiva');

insert into user(id,user_email,pwd,role,user_id) VALUES (1,'TestUser@gmail.com','user123','user','U123');
insert into user(id,user_email,pwd,role,user_id) VALUES (2,'AbhiUser@gmail.com','abhipwd','user','Uabhi');
insert into user(id,user_email,pwd,role,user_id) VALUES (3,'AshuUser@gmail.com','ashupwd','user','Uashu');
insert into user(id,user_email,pwd,role,user_id) VALUES (4,'CammyCustomer@gmail.com','cammypwd','customer','Ccammy');
insert into user(id,user_email,pwd,role,user_id) VALUES (5,'RamaCustomer@gmail.com','ramapwd','customer','Crama');
insert into user(id,user_email,pwd,role,user_id) VALUES (6,'RakeshCustomer@gmail.com','rakeshpwd','customer','Crakesh');
insert into user(id,user_email,pwd,role,user_id) VALUES (7,'TestCustomer@gmail.com','customer12345','customer','C12345');