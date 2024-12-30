package com.educators.netflix.controller;

import com.educators.netflix.model.Episode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodes")
public class EpisodeController {

    @PostMapping
    public Episode createEpisode(@RequestBody Episode episode) {
        return episode;
    }

    @GetMapping("/{id}")
    public Episode getEpisode(@PathVariable String id) {
        return new Episode();  // return episode based on id
    }

    @GetMapping
    public List<Episode> getAllEpisodes() {
        return List.of(new Episode());  // return list of episodes
    }

    @PutMapping("/{id}")
    public Episode updateEpisode(@PathVariable String id, @RequestBody Episode episode) {
        return episode;
    }

    @DeleteMapping("/{id}")
    public void deleteEpisode(@PathVariable String id) {
    }
}
