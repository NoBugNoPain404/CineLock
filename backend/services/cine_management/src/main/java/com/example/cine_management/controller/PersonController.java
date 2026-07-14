package com.example.cine_management.controller;


import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.pojo.PersonDetailDto;
import com.example.cine_management.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<PersonDetailDto>> getInfoById(@PathVariable Integer id) {
        return ResponseEntity.ok(
                personService.getPersonDetail(id)
        );
    }
}
