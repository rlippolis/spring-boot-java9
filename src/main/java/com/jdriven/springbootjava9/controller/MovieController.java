package com.jdriven.springbootjava9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.jdriven.springbootjava9.domain.Movie;
import com.jdriven.springbootjava9.service.MovieService;

@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(final MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity.ok(this.movieService.findAll());
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> findById(@PathVariable("id") final long id) {
        return movieService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }
}
