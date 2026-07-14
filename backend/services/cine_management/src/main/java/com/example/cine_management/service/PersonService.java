package com.example.cine_management.service;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.pojo.PersonDetailDto;
import com.example.cine_management.service.cache.PersonCacheService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonCacheService personCacheService;

    public ApiResponse<PersonDetailDto> getPersonDetail(Integer id) {
        return ApiResponse.success(
                201,
                personCacheService.getInfoById(id),
                "Get person detail successfully"
                );
    }
}
