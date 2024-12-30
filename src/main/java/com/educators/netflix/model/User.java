package com.educators.netflix.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private String subscriptionPlan;
    private List<String> watchedMovies;  // List of watched movie IDs
    private List<String> favoriteMovies; // List of favorite movie IDs
    private List<String> watchlist;      // List of watchlist movie IDs
}

