package com.example.spring.exceptions;

public class LanguageDetailsNotFoundException extends Exception{
    public LanguageDetailsNotFoundException(String message) {
        super(message);
    }
}
