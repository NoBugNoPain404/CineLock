create table if not exists cine_management.nation (
    id integer generated always as identity not null primary key,
    name varchar(255) not null,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);

create index idx_nation on cine_management.nation(id)
include (name);

