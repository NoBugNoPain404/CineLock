create table if not exists cine_management.cinema (
    id integer not null primary key,
    name varchar(255) not null,
    address varchar(255) not null,
    city integer references cine_management.city(id),
    latitude decimal(10, 8),
    longitude decimal(11, 8),
    phone varchar(20),
    email varchar(255),
    status varchar(255),
    image varchar(255),
    created_at timestamptz not null default now(),
    updated_at timestamptz default now()
);

create index if not exists idx_cinema_info on cine_management.cinema(id)
include (name, address, city, latitude, longitude, phone, email, status);

