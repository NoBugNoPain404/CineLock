package com.example.cine_management.service.cache;

import com.example.cine_management.entity.Person;
import com.example.cine_management.errors.NotFoundObject;
import com.example.cine_management.pojo.PersonDetailDto;
import com.example.cine_management.repository.NationalityRepository;
import com.example.cine_management.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonCacheService {

    private final PersonRepository personRepository;

    private final NationalityRepository nationalityRepository;

    @Cacheable(value = "personDetail", key = "#id", unless = "#result == null")
    @Transactional
    public PersonDetailDto getInfoById(Integer id) {
        Person person = personRepository.findById(id)
                 .orElseThrow(() -> new NotFoundObject("Not found person details!"));
        List<String> nations = nationalityRepository.findPersonNationalitiesById(id)
                .stream()
                .map(personNationality -> personNationality.getNation().getName())
                .toList();
        return new PersonDetailDto(person.getId(),
                person.getName(),
                person.getGender(),
                person.getDob(),
                new HashSet<>(nations),
                person.getImage(),
                person.getNote());
    }
}
