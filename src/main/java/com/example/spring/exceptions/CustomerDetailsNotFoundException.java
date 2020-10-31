package com.example.spring.exceptions;

public class CustomerDetailsNotFoundException extends Exception {
    public CustomerDetailsNotFoundException(String message) {
        super(message);
    }
}
