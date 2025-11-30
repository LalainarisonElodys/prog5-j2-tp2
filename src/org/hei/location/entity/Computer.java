package org.hei.location.entity;

public class Computer implements Locatable {
    private String model;
    private double price;

    public Computer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getName() {
        return model;
    }

    @Override
    public double getValue() {
        return price;
    }
}
