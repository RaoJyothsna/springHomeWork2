package com.example.spring.exceptions;

public class MovieTheatreDetailsNotFoundException extends Exception {
    public MovieTheatreDetailsNotFoundException(String message) {
        super(message);
    }
}
