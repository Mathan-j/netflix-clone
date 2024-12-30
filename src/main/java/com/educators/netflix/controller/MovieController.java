package com.educators.netflix.controller;

import com.educators.netflix.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {

        return movie;
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable String id) {

        return new Movie();
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return List.of(new Movie());
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable String id, @RequestBody Movie movie) {
        return movie;
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable String id) {
    }
}
