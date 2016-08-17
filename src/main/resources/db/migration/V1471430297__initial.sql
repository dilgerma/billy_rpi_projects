create sequence hibernate_sequence start with 1 increment by 1;
create table customer (id bigint not null, city varchar(255), house_number varchar(255), street varchar(255), zip varchar(255), name varchar(255), primary key (id));
create table projects (id bigint not null, start date, hour_rate decimal(19,2), name varchar(255), end date, customer_id bigint, primary key (id));
alter table projects add constraint project_name_uq unique (name);
alter table projects add constraint project_customer_fk foreign key (customer_id) references customer;
