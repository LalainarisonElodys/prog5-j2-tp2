package org.hei.location.entity;

public class Association implements Renter{
    private String name;
    private String phone;

    public Association(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Association";
    }
}
