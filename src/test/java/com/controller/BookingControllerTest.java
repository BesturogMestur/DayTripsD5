package com.controller;

import com.model.Booking;
import com.model.Trip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BookingControllerTest {

    private BookingController bookingController;
    private Booking mockBooking;
    private Trip mockTrip;

    @BeforeEach
    void setUp() {
        bookingController = new BookingController();
        mockBooking = mock(Booking.class);
        mockTrip = mock(Trip.class);
    }

    @Test
    void testAddAndDelBooking() {
        bookingController.setBooking("1", mockTrip);

        bookingController.addBooking();
        assertNull(bookingController.getBooking(), "Booking should be null after addBooking()");

        bookingController.setBooking("1", mockTrip);

        bookingController.delBooking();
        assertNull(bookingController.getBooking(), "Booking should be null after delBooking()");
    }

    @Test
    void testSetAndGetBooking() {
        bookingController.setBooking("1", mockTrip);
        assertNotNull(bookingController.getBooking(), "Booking should not be null after setBooking()");

        // Verifying the Booking properties
        Booking booking = bookingController.getBooking();
        assertEquals("1", booking.getId(), "Booking ID should match the one set");
        assertEquals(mockTrip, booking.getTripObject(), "Booking Trip should match the one set");
    }

    @Test
    void testFindBooking() {
        // todo
    }

    @Test
    void testOverloadedFindBooking() {
        Booking[] bookings = bookingController.findBooking("1");
        assertNotNull(bookings, "findBooking() should return an array, even if empty.");
        assertEquals(0, bookings.length, "With no bookings, the length should be 0.");
    }
}
