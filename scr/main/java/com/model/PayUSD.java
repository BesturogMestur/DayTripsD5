package com.model;

public class PayUSD extends Pay {
    private double value;

    public PayUSD() {
        super();
    }

    public void setValue(Double v) {
        value = v;
    }

    public double getValue() {
        return value;
    }
}


