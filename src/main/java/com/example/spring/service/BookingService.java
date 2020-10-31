package com.example.spring.service;



import com.example.spring.entities.Booking;
import com.example.spring.exceptions.BookingDetailsNotFoundException;
import com.example.spring.exceptions.CustomerDetailsNotFoundException;
import com.example.spring.exceptions.MovieTheatreDetailsNotFoundException;

import java.util.List;

public interface BookingService {
    public Booking acceptBookingDetails(Booking booking) throws MovieTheatreDetailsNotFoundException, CustomerDetailsNotFoundException;
    public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException;
    public boolean deleteBooking(int id) throws BookingDetailsNotFoundException;
    public List<Booking> getAllBookingDetails();
}
