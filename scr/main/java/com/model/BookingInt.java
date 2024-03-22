package com.model;

public interface BookingInt {
    void add() throws Exception;

    void del() throws Exception;

    void find(String id, String type, char date);
}
