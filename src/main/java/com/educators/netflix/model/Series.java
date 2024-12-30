package com.educators.netflix.model;

import java.util.List;

public class Series {
    private String id;
    private String name;
    private String genre;
    private String description;
    private int releaseDate;
    private double imdbRating;
    private List<String> language;
    private String ageCategory;
    private List<String> cast;
    private List<Season> seasons;
}
