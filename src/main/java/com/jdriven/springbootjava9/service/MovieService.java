package com.jdriven.springbootjava9.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.jdriven.springbootjava9.domain.Movie;
import com.jdriven.springbootjava9.repository.MovieRepository;

@Service
@Transactional
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return this.movieRepository.findAll();
    }

    public Optional<Movie> findById(final long id) {
        return this.movieRepository.findById(id);
    }

    public Movie create(final String title, final double rating) {
        final Movie movie = new Movie();
        movie.setTitle(title);
        movie.setRating(rating);
        return movieRepository.save(movie);
    }
}
