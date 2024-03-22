package com.model;

public class PayGBP extends Pay {
    private double value;

    public PayGBP() {
        super();
    }

    public void setValue(Double v) {
        value = v;
    }

    public double getValue() {
        return value;
    }
}

