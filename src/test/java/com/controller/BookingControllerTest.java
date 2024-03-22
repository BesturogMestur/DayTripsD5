package com.controller;

import com.model.Booking;
import com.model.Trip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class BookingControllerTest {

    private BookingController controller;
    private Booking mockBooking;
    private Trip mockTrip;

    @BeforeEach
    void setUp() {
        mockBooking = mock(Booking.class);
        mockTrip = mock(Trip.class);
        controller = new BookingController();
    }

    @Test
    void testAddAndDeleteBooking() {
        String bookingId = "123";
        controller.setBooking(bookingId, mockTrip);
        controller.addBooking();
    }
}
