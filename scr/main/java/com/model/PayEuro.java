package com.model;

public class PayEuro extends Pay {
    private double value;

    public PayEuro() {
        super();
    }

    public void setValue(Double v) {
        value = v;
    }

    public double getValue() {
        return value;
    }
}
