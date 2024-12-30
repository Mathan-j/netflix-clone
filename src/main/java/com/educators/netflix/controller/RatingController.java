package com.educators.netflix.controller;

import com.educators.netflix.model.Rating;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @PostMapping
    public Rating createRating(@RequestBody Rating rating) {

        return rating;
    }

    @GetMapping("/{id}")
    public Rating getRating(@PathVariable String id) {

        return new Rating();  // return rating based on id
    }

    @GetMapping
    public List<Rating> getAllRatings() {

        return List.of(new Rating());  // return list of ratings
    }

    @PutMapping("/{id}")
    public Rating updateRating(@PathVariable String id, @RequestBody Rating rating) {

        return rating;
    }

    @DeleteMapping("/{id}")
    public void deleteRating(@PathVariable String id) {

    }
}
