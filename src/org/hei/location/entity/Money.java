package org.hei.location.entity;

public class Money implements Locatable {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    @Override
    public String getName() {
        return "Money";
    }

    @Override
    public double getValue() {
        return amount;
    }
}
