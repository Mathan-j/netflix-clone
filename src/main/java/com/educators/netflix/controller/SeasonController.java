package com.educators.netflix.controller;

import com.educators.netflix.model.Season;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seasons")
public class SeasonController {

    @PostMapping
    public Season createSeason(@RequestBody Season season) {

        return season;
    }

    @GetMapping("/{id}")
    public Season getSeason(@PathVariable String id) {

        return new Season();  // return season based on id
    }

    @GetMapping
    public List<Season> getAllSeasons() {

        return List.of(new Season());  // return list of seasons
    }

    @PutMapping("/{id}")
    public Season updateSeason(@PathVariable String id, @RequestBody Season season) {

        return season;
    }

    @DeleteMapping("/{id}")
    public void deleteSeason(@PathVariable String id) {

    }
}
