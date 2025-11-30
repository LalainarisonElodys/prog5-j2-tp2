package org.hei.location.entity;

public class Company implements Rentable {
    private String companyName;
    private String companyAddress;
    private String companyPhone;

    public Company(String companyName, String companyAddress, String companyPhone) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    @Override
    public String getRenterType() {
        return "Company";
    }
}
