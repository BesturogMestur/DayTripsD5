package com.controller;

import com.model.Booking;
import com.model.Trip;

public class BookingController {
    private Booking book;

    public void addBooking() {
        this.book.add();
        this.book = null;
    }

    public void delBooking() {
        this.book.del();
        this.book = null;
    }

    public void setBooking(String id, Trip trip) {
        this.book = new Booking(id, trip);
    }

    public void findBooking(String id, String type, char date) {
        book.find(id, type, date);
    }

    public Booking getBooking() {
        return book;
    }

    public Booking[] findBooking(String id) {
        return new Booking[0];
    }
}
