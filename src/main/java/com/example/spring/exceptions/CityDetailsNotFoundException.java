package com.example.spring.exceptions;

public class CityDetailsNotFoundException extends Exception {
    public CityDetailsNotFoundException(String message) {
        super(message);
    }
}
