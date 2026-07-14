package com.example.cine_management.repository;

import com.example.cine_management.entity.PersonNationality;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@NullMarked
public interface NationalityRepository extends JpaRepository<PersonNationality, Integer> {

    List<PersonNationality> findPersonNationalitiesById(Integer id);
}
