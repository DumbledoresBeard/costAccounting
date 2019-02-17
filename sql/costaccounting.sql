DROP DATABASE IF EXISTS costaccounting;
CREATE DATABASE `costaccounting`;
USE `costaccounting`;

CREATE TABLE expense_kind (expense_kind_id int auto_increment,
name varchar (100) not null,
is_regular boolean,
PRIMARY KEY(expense_kind_id)
)ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE expense (id int auto_increment,
expense float not null,
local_date date,
expense_kind_id int,
PRIMARY KEY(id),
FOREIGN KEY (expense_kind_id) REFERENCES expense(id) ON DELETE CASCADE
)ENGINE=InnoDB CHARACTER SET=UTF8;
