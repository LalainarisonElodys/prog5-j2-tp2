package org.hei.location.entity;

public class Association implements Rentable {
    private String AssociationName;
    private String AssociationPhone;

    public Association(String associationName, String associationPhone) {
        AssociationName = associationName;
        AssociationPhone = associationPhone;
    }

    public String getAssociationName() {
        return AssociationName;
    }

    public String getAssociationPhone() {
        return AssociationPhone;
    }

    @Override
    public String getRenterType() {
        return "Association";
    }
}
