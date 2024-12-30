package com.educators.netflix.model;

import java.util.List;

public class Subscription {
    private String id;
    private String planName;   // (Basic, Standard, Premium)
    private double price;
    private List<String> features; // Features of the subscription plan
}
