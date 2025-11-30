package org.hei.location.entity;

public class Car implements Locatable {
    private String name;
    private double value;

    public Car(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }
}
