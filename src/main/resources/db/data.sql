insert into store_tb(name, stock, price) values('바나나', 40, 3000);
insert into store_tb(name, stock, price) values('딸기', 45, 2000);

insert into user_tb(username, password, fullname, created_at) values ('ssar', '1234', '쌀', now());
insert into user_tb(username, password, fullname, created_at) values ('cos', '1234', '코스', now());

insert into order_tb(store_id, qty, total_price, user_id) values(1, 5, 15000, 1);
insert into order_tb(store_id, qty, total_price, user_id) values(1, 5, 15000, 1);
insert into order_tb(store_id, qty, total_price, user_id) values(2, 5, 10000, 2);