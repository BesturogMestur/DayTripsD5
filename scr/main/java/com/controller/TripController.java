package com.controller;

import com.model.Pay;
import com.model.Trip;

public class TripController{
    private Trip trip;

    public void makeTrip(String type, String location, char date, Pay price) throws Exception {
	this.trip.add(type, location, date, price);
    }

    public void findTrip(String type, char date) throws Exception {
	this.trip.find(type, date);
    }

    public void delTrip() throws Exception {
	this.trip.del();
    }

    public Trip getTrip(){
	return this.trip;
    }
}
