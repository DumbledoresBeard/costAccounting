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
FOREIGN KEY (expense_kind_id) REFERENCES expense_kind(expense_kind_id) ON DELETE CASCADE
)ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE settings (id int auto_increment,
period_start_date date,
auto_counting boolean,
PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE budget (id int auto_increment,
 budget float,
 startDate date,
 endDate date,
 PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE savings_funds (id int auto_increment,
 money float,
 savings_funds_date date,
 PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE sum_of_expenses (id int auto_increment,
sum_of_expenses float,
period_start_date date,
period_end_date date,
expense_kind_id int,
PRIMARY KEY (id),
FOREIGN KEY (expense_kind_id) REFERENCES expense_kind(expense_kind_id) ON DELETE CASCADE
) ENGINE=InnoDB CHARACTER SET=UTF8;

CREATE TABLE settings (id int auto_increment,
period_start_date date,
auto_counting boolean,
PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET=UTF8;


