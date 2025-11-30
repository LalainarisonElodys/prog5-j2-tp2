package org.hei.location.entity;

public class Company implements Renter{
    private String companyName;
    private String companyAddress;
    private String companyPhone;

    public Company(String companyName, String companyAddress, String companyPhone) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
    }
    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public String getType() {
        return "company";
    }
}
