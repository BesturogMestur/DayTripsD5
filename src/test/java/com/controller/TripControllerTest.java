package com.controller;

import com.model.Pay;
import com.model.Trip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class TripControllerTest {

    private TripController tripController;
    private Trip mockTrip;
    private Pay mockPay;

    @BeforeEach
    void setUp() {
        tripController = new TripController();

        mockTrip = mock(Trip.class);
        mockPay = mock(Pay.class);

        tripController.trip = mockTrip;
    }

    @Test
    void testMakeTrip() throws Exception {
        String type = "Vacation";
        String location = "Hawaii";
        String date = "2024-07-01";
        tripController.makeTrip(type, location, date, mockPay);

        verify(mockTrip).add(type, location, date, mockPay);
    }

    @Test
    void testFindTrip() throws Exception {
        String type = "Vacation";
        String date = "2024-07-01";
        tripController.findTrip(type, date);

        verify(mockTrip).find(type, date);
    }

    @Test
    void testDelTrip() throws Exception {
        tripController.delTrip();
        verify(mockTrip).del();
    }

    @Test
    void testGetTrip() {
        assertEquals(mockTrip, tripController.getTrip(), "getTrip() should return the correct Trip instance.");
    }
}
