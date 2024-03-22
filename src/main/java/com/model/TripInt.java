package com.model;

public interface TripInt{
    public void find(String type, char date) throws Exception;
    public void del() throws Exception;
    public void add(String type, String location, char date, Pay price) throws Exception;
}
