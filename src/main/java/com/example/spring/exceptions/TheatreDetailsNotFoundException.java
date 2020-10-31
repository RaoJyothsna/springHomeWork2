package com.example.spring.exceptions;

public class TheatreDetailsNotFoundException extends Exception {
    public TheatreDetailsNotFoundException(String message) {
        super(message);
    }
}
