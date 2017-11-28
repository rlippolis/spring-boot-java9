package com.jdriven.springbootjava9.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.jdriven.springbootjava9.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
