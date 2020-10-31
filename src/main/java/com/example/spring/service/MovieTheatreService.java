package com.example.spring.service;


import com.example.spring.entities.MovieTheatre;
import com.example.spring.exceptions.MovieDetailsNotFoundException;
import com.example.spring.exceptions.MovieTheatreDetailsNotFoundException;
import com.example.spring.exceptions.TheatreDetailsNotFoundException;

import java.util.List;

public interface MovieTheatreService {
    public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre) throws MovieDetailsNotFoundException, TheatreDetailsNotFoundException;
    public MovieTheatre getMovieTheatreDetails(int id) throws MovieTheatreDetailsNotFoundException;
    public boolean deleteMovieTheatre(int id) throws MovieTheatreDetailsNotFoundException;
    public List<MovieTheatre> getAllMovieTheatreDetails();
}
