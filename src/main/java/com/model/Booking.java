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
        // Test print fyir test case, a eftir ad implementa
        System.out.println("Booking Added");
    }

    public void del() {
        // Test print fyir test case, a eftir ad implementa
        System.out.println("Booking Deleted");
    }

    public void find(String id, String type, String date) {
        // Test print fyir test case, a eftir ad implementa
        System.out.println("Finding booking with id " + id + "type " + type + "and date " + date);
    }
}
