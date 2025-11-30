package org.hei.location.entity;

public class Money implements Rentable{
    private final double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    @Override
    public double getRentalPrice() {
        return amount;
    }
}
