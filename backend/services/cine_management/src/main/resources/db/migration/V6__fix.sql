alter table cine_management.movie
add status varchar(50);

alter table cine_management.movie_actor
add column if not exists character varchar(255);

create index idx_genre_movie
    on cine_management.movie_genre(genre_id, movie_id);

create index idx_nation_movie
    on cine_management.movie_nation(nation_id, movie_id);

create index idx_actor_movie
    on cine_management.movie_actor(person_id, movie_id);

create index idx_director_movie
    on cine_management.movie_director(person_id, movie_id);

create index idx_company_movie
    on cine_management.movie_company(company_id, movie_id);

create index idx_movie_year
    on cine_management.movie(release_date)
    include (name, detail, duration, age_rating, banner, rates);