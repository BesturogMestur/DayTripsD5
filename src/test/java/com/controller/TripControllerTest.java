package com.controller;

import com.model.Pay;
import com.model.Trip;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class TripControllerTest {

    private Trip mockTrip = mock(Trip.class);
    private TripController controller = new TripController();

    @Test
    void testMakeTrip() throws Exception {
        Pay mockPay = mock(Pay.class);
        controller.makeTrip("vacation", "Hawaii", "2023-04-10", mockPay);
        verify(mockTrip, times(1)).add("vacation", "Hawaii", "2023-04-10", mockPay);
    }

    @Test
    void testDelTrip() throws Exception {
        controller.delTrip();
        verify(mockTrip, times(1)).del();
    }
}
