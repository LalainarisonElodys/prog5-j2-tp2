package org.hei.location.entity;

public class Car implements Rentable{
    private final double carPricePerDay;

    public Car(double carPricePerDay) {
        this.carPricePerDay = carPricePerDay;
    }

    @Override
    public double getRentalPrice() {
        return carPricePerDay;
    }
}
