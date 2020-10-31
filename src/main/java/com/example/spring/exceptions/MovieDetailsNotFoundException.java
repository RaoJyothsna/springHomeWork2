package com.example.spring.exceptions;

public class MovieDetailsNotFoundException extends Exception {
    public MovieDetailsNotFoundException(String message) {
        super(message);
    }
}
