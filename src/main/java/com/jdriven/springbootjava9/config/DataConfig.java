package com.jdriven.springbootjava9.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


import com.jdriven.springbootjava9.service.MovieService;

@Configuration
public class DataConfig {

    private final MovieService movieService;

    @Autowired
    public DataConfig(final MovieService movieService) {
        this.movieService = movieService;
    }

    @PostConstruct
    public void initialLoad() {
        movieService.create("The Shawshank Redemption", 9.2);
        movieService.create("The Godfather", 9.0);
        movieService.create("The Godfather: Part II", 9.0);
        movieService.create("The Dark Knight", 9.0);
        movieService.create("12 Angry Men", 8.9);
        movieService.create("Schindler's List", 8.9);
        movieService.create("Pulp Fiction", 8.9);
        movieService.create("The Lord of the Rings: The Return of the King", 8.9);
        movieService.create("Il buono, il brutto, il cattivo", 8.8);
        movieService.create("Fight Club", 8.8);
    }
}
