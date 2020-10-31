package com.example.spring.exceptions;

public class UserTypeDetailsNotFoundException extends Exception {
    public UserTypeDetailsNotFoundException(String message) {
        super(message);
    }
}
