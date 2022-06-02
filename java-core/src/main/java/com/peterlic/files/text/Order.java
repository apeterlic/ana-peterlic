package com.peterlic.files.text;

import java.util.UUID;

class Order {

    private UUID orderNumber;
    private double price;

    public Order(UUID orderNumber, double price) {
        this.orderNumber = orderNumber;
        this.price = price;
    }

    // getters and setters

    public UUID getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(UUID orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return orderNumber + ";" + price;
    }
}
