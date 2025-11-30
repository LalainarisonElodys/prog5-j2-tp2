package org.hei.location.entity;

public class Person implements Rentable {
    private String name;
    private String phone;
    private String address;

    public Person(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getRenterType() {
        return "Person";
    }
}
