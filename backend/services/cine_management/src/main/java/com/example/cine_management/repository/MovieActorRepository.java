package com.example.cine_management.repository;

import com.example.cine_management.entity.MovieActor;
import com.example.cine_management.pojo.BasicPersonDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieActorRepository extends JpaRepository<MovieActor, Integer> {

    @Query("""
        select new com.example.cine_management.pojo.BasicPersonDto(p.id, p.name)
        from Person p
        inner join MovieActor ma on ma.person.id = p.id
        where ma.movie.id = :movieId
    """
    )
    List<BasicPersonDto> getActorsByMovieId(Integer movieId);
}
