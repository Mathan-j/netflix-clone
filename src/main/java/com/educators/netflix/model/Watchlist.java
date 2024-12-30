package com.educators.netflix.model;

import java.util.List;

public class Watchlist {
    private String id;
    private String userId;       // Reference to User
    private List<String> movieIds; // List of movie IDs
}
