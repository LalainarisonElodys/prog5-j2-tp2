package org.hei.location.entity;

public class Bike implements Rentable{
    private final double pricePerDay;

    public Bike(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getRentalPrice() {
        return pricePerDay;
    }
}
