package com.model;

import java.util.HashMap;
import java.util.Map;

public abstract class Pay {
    private Map<String, Double> conversionRate;

    public Pay() {
        conversionRate = new HashMap<>();
        // Initialize conversion rates as needed
        conversionRate.put("ISK", 1.0); // For simplicity, assuming 1:1 for ISK
        conversionRate.put("EUR", 149.10); // Example conversion rate for EUR
        conversionRate.put("GBP", 174.58); // Example conversion rate for GBP
        conversionRate.put("USD", 137.42); // Example conversion rate for USD
    }

    public long getISK(Double value, String currency) {
        double conversionFactor = getConversionRate(currency);
        return Math.round(value * conversionFactor);
    }

    public double getConversionRate(String currency) {
        return conversionRate.getOrDefault(currency, 0.0);
    }
}