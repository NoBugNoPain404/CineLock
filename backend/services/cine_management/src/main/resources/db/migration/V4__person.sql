create table if not exists cine_management.person(
    id integer generated always as identity not null primary key,
    name varchar(255) not null,
    gender bit,
    image varchar(255),
    dob date,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);

create index idx_person on cine_management.person(id)
include (name, gender, image, dob);

create table if not exists cine_management.nationality (
    id integer generated always as identity not null primary key,
    person_id integer references cine_management.person(id),
    nation integer references cine_management.nation(id),
    created_at timestamptz default now(),
    updated_at timestamptz default now(),
    unique (person_id, nation)
);

create index idx_nationality on cine_management.nationality(person_id, nation);

