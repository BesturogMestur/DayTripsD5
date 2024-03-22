package com.model;

import java.time.LocalDate;

public class Booking {
    private String id;
    private Trip trip;

    public Booking(String id, Trip trip) {
        this.id = id;
        this.trip = trip;
    }

    public void updateTrip(Trip t) {
        trip = t;
    }

    public Trip getTripObject() {
        return trip;
    }

    public String getTrip() {
        return trip.toString();
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return id; // Assuming the ID is the user ID
    }

    public LocalDate getTripDate() {
        return trip.getTripDate();
    }

    public String getTripName() {
        return trip.getName();
    }

    public void add() {
        // Implement add method
    }

    public void del() {
        // Implement del method
    }

    public void find(String id, String type, char date) {
        // Implement find method
    }
}
