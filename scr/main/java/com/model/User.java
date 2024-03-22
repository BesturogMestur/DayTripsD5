package com.model;

import com.controller.BookingController;
import com.model.Booking;

public class User {
    private String id;
    private String password; // Change to String for better password handling
    private String fName;
    private String lName;
    private Booking[] booking;
    private int countBooking;

    public User(String id, String password, String fName, String lName) {
        setId(id);
        setPassword(password);
        setFName(fName);
        setLName(lName);
        setBooking();
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private void setFName(String name) {
        fName = name;
    }

    public String getFName() {
        return fName;
    }

    private void setLName(String name) {
        lName = name;
    }

    public String getLName() {
        return lName;
    }

    private void updateBooking() {
        setBooking();
    }

    private void setBooking() {
        BookingController book = new BookingController();
        this.booking = book.findBooking(this.id);
    }


    public Booking[] getBooking() {
        return this.booking;
    }

    private void setPassword(String pw) {
        this.password = pw;
    }

    public String getPassword() {
        return password;
    }
}
