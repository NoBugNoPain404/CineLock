create table if not exists cine_management.genre (
    id integer generated always as identity not null primary key,
    name varchar(255) not null,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);

create index idx_genre on cine_management.genre(id)
    include (name);

create table if not exists cine_management.product_company (
    id integer generated always as identity not null primary key,
    name varchar(255) not null,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);

create index idx_company on cine_management.product_company(id)
    include (name);

create table if not exists cine_management.movie(
    id integer generated always as identity not null primary key,
    name varchar(255) not null,
    detail text,
    release_date date not null,
    duration integer not null,
    age_rating varchar(10) not null,
    banner varchar(255) not null,
    trailer varchar(255) not null,
    rates float not null default 0,
    votes integer not null default 0,
    vote_sum integer not null default 0,
    created_at timestamptz default now(),
    updated_at timestamptz default now()
);

create index idx_movie_info on cine_management.movie(id)
include (name, detail, release_date, duration, age_rating, banner, trailer, rates, votes, vote_sum);

create table if not exists cine_management.movie_genre (
    id integer generated always as identity not null primary key,
    movie_id integer references cine_management.movie(id),
    genre_id integer references cine_management.genre(id)
);

create index idx_movie_genre on cine_management.movie_genre(movie_id, genre_id);

create table if not exists cine_management.movie_nation (
    id integer generated always as identity not null primary key,
    movie_id integer references cine_management.movie(id),
    nation_id integer references cine_management.nation(id)
);

create index idx_movie_nation on cine_management.movie_nation(movie_id, nation_id);

create table if not exists cine_management.movie_actor (
    id integer generated always as identity not null primary key,
    movie_id integer references cine_management.movie(id),
    person_id integer references cine_management.person(id)
);

create index idx_movie_actor on cine_management.movie_actor(movie_id, person_id);


create table if not exists cine_management.movie_director (
    id integer generated always as identity not null primary key,
    movie_id integer references cine_management.movie(id),
    person_id integer references cine_management.person(id)
);

create index idx_movie_director on cine_management.movie_director(movie_id, person_id);

create table if not exists cine_management.movie_company (
    id integer generated always as identity not null primary key,
    movie_id integer references cine_management.movie(id),
    company_id integer references cine_management.product_company(id)
);

create index idx_movie_company on cine_management.movie_company(movie_id, company_id);



