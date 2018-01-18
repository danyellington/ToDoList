SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS tasks (
  id int PRIMARY KEY auto_increment,
  taskName VARCHAR,
  description VARCHAR,
  completed BOOLEAN,
  categoryId INTEGER
);

CREATE TABLE IF NOT EXISTS categories (
 id int PRIMARY KEY auto_increment,
 name VARCHAR
);