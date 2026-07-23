package com.example.cine_management.repository;

import com.example.cine_management.entity.MovieDirector;
import com.example.cine_management.pojo.BasicPersonDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDirectorRepository extends JpaRepository<MovieDirector, Integer> {

    @Query(
            """
            select new com.example.cine_management.pojo.BasicPersonDto(p.id, p.name)
            from Person p
            inner join MovieDirector md on p.id = md.person.id
            where md.movie.id = :id
            """
    )
    List<BasicPersonDto> getDirectorsByMovieId(Integer id);
}
