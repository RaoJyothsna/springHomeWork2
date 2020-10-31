package com.example.spring.exceptions;

public class CustomerUserNameExistsException extends Exception {
    public CustomerUserNameExistsException(String message) {
        super(message);
    }
}
