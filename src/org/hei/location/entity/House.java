package org.hei.location.entity;

public class House implements Rentable{
    private final String adress;
    private final double pricePerMonth;

    public House(String adress, double pricePerMonth) {
        this.adress = adress;
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public double getRentalPrice() {
        return pricePerMonth;
    }
}
