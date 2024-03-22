package com.model;

import java.time.LocalDate;

public class Trip{
    private String type;
    private String location;
    private char date;
    private Pay price;

    public Trip(String type, String location, String date, Pay price){
	    getTrip(type, location);
    }

    public Trip(String tripName, String location, LocalDate tripDate, Pay price) {
        addTrip(tripName, location,tripDate, price);
    }

    private void addTrip(String type, String location, LocalDate date, Pay price) {
    }

    private void getTrip(String type, String location) {
    }

    protected void SetType(String name){
	type = name;
    }

    public String getType(){
	return type;
    }

    protected void setLocation(String name){
	location = name;
    }

    public String getlocation(){
	return location;
    }

    protected void setDate(char day){
	date = day;
    }

    public char getDate(){
	return date;
    }

    protected void setPrice(Pay p){
	price = p;
    }

    public Pay getPrice(){
	return price;
    }

    public void add(String type, String location, String date, Pay price) throws Exception {
    }

    public LocalDate getTripDate() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void find(String type, char date) throws Exception {
    }

    public void del() throws Exception {
    }
}
