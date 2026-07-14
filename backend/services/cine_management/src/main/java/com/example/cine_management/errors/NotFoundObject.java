package com.example.cine_management.errors;

public class NotFoundObject extends RuntimeException {

    public NotFoundObject(String message) {
        super(message);
    }
}
