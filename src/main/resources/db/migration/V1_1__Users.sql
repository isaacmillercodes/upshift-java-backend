DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id serial PRIMARY KEY,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);