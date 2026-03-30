package com.exc.service;


public class Customer {
    private String name;
    private String membershipType;

    public void setName(String name) {
        this.name = name;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return name + " (" + membershipType + ")";
    }
}
