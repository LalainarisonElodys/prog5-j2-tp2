package org.hei.location.entity;

public class House implements Locatable {
    private String address;
    private double value;

    public House(String address, double value) {
        this.address = address;
        this.value = value;
    }

    @Override
    public String getName() {
        return address;
    }

    @Override
    public double getValue() {
        return value;
    }
}
