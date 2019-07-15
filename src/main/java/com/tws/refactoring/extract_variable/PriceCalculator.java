package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final static Integer QUANTITY_MAX = 500;
    private final static Double DISCOUNT_RATE = 0.05;
    private final static Double SHIPPING_COST_RATE = 0.1;
    private final static int SHIPPING_COST_MAX = 100;

    public double getPrice(int quantity, int itemPrice) {
        int base_price = quantity * itemPrice;
        double discount = Math.max(0, quantity - QUANTITY_MAX) * itemPrice * DISCOUNT_RATE;
        double shipping_cost = Math.min(quantity * itemPrice * SHIPPING_COST_RATE, SHIPPING_COST_MAX);
        return base_price-discount+shipping_cost;
    }

    // Price consists of: base price - discount + shipping cost
    private double getaDouble(int quantity, int itemPrice) {
        return quantity * itemPrice -
                Math.max(0, quantity - QUANTITY_MAX) * itemPrice * DISCOUNT_RATE +
                Math.min(quantity * itemPrice * SHIPPING_COST_RATE, SHIPPING_COST_MAX);
    }
}
