package com.example.spring.exceptions;

public class BookingDetailsNotFoundException extends Exception {
    public BookingDetailsNotFoundException(String message) {
        super(message);
    }
}
