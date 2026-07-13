package com.example.cine_management.common;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse<T> {
    private Integer httpCode;
    private String message;
    private T data;

    public ApiResponse(Integer httpCode, String message, T data) {
        this.httpCode = httpCode;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(Integer httpCode, T data) {
        this.httpCode = httpCode;
        this.data = data;
    }

}
