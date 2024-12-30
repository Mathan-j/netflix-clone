package com.educators.netflix.model;

import java.util.List;

public class Season {
    private String id;
    private String seriesId; // Reference to Series
    private int seasonNumber;
    private List<Episode> episodes;
}
