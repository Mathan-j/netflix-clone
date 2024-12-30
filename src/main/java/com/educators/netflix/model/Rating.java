package com.educators.netflix.model;

public class Rating {
    private String id;
    private String userId;     // Reference to User
    private String movieId;    // Reference to Movie
    private int rating;        // Rating (e.g., 1-10)
    private String reviewText; // Optional review text
}
