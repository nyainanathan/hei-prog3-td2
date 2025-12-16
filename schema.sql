CREATE TYPE ingredient_type AS ENUM (
    'VEGETABLE',
    'ANIMAL',
    'MARINE',
    'DAIRY',
    'OTHER'
);

CREATE TYPE dish_type AS ENUM (
    'START',
    'MAIN',
    'DESSERT'
);

CREATE TABLE Dish(
    id serial primary key,
    name varchar(200) not null,
    dish_type dish_type default 'MAIN'
);

CREATE TABLE ingredient(
    id serial primary key,
    name varchar(200) not null,
    price numeric(4,2) default 0,
    category ingredient_type default 'OTHER'
)

