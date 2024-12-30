package com.educators.netflix.controller;

import com.educators.netflix.model.Series;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/series")
public class SeriesController {

    @PostMapping
    public Series createSeries(@RequestBody Series series) {

        return series;
    }

    @GetMapping("/{id}")
    public Series getSeries(@PathVariable String id) {

        return new Series();  // return series based on id
    }

    @GetMapping
    public List<Series> getAllSeries() {

        return List.of(new Series());  // return list of series
    }

    @PutMapping("/{id}")
    public Series updateSeries(@PathVariable String id, @RequestBody Series series) {

        return series;
    }

    @DeleteMapping("/{id}")
    public void deleteSeries(@PathVariable String id) {

    }
}
