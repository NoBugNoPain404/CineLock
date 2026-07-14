package com.example.cine_management.common;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;

@Builder
@Data
public class ApiResponse<T> {
    private Boolean success;
    private Integer httpCode;
    private String message;
    private T data;
    private LocalDateTime timestamp;

    public static <T> ApiResponse<T> success(Integer code, T data, String message) {
        return ApiResponse.<T>builder()
                .success(true)
                .httpCode(code)
                .data(data)
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
    }

}
