package org.hei.location.entity;

public class Association implements Rentable {
    private String associationName;
    private String associationPhone;

    public Association(String associationName, String associationPhone) {
        associationName = associationName;
        associationPhone = associationPhone;
    }

    public String getAssociationName() {
        return associationName;
    }

    public String getAssociationPhone() {
        return associationPhone;
    }

    @Override
    public String getRenterType() {
        return "Association";
    }
}
