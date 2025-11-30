package org.hei.location.entity;

public class PC implements Rentable{
    private final double pricePerDay;

    public PC(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getRentalPrice() {
        return pricePerDay;
    }
}
