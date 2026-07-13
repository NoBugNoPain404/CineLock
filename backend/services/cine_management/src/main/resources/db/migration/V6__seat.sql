alter table cine_management.movie
add column if not exists status varchar(50) not null default 'Upcoming',