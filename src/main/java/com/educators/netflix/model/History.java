package com.educators.netflix.model;

import java.util.List;

public class History {
    private String id;
    private String userId;       // Reference to User
    private List<String> movieIds; // List of movie IDs
    private List<String> watchedTimestamps; // Timestamps for when movies were watched
}
