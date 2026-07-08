package com.example.cine_management.common;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(Exception.class)
    public ErrorResponse commonExceptionHandler(Exception ex, HttpServletRequest request) {

        System.out.println(ex.getMessage());
        return ErrorResponse.builder()
                .timestamp(Instant.now())
                .status(503)
                .error("Internal Server Error")
                .message("Some thing went wrong")
                .path(request.getServletPath())
                .build();
    }
}
