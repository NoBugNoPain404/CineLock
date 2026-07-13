create schema if not exists cine_management;

create table if not exists cine_management.city (
    id integer not null primary key,
    name varchar(255) not null unique,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);