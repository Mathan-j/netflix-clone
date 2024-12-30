package com.educators.netflix.model;

public class Payment {
    private String id;
    private String userId;       // Reference to User
    private double amount;
    private String paymentMethod; // (e.g., Credit Card, PayPal)
    private String paymentStatus; // (e.g., Paid, Pending)
    private String paymentDate;   // Date of payment
}
