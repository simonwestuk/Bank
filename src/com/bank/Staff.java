package com.bank;

import java.util.Date;

public class Staff extends Person {

    private int staffID;
    private static int numberOfStaff = 1000;
    private Role role;

    public Staff(String name, Date dob, Role role) {
        super(name, dob);
        this.role = role;
        this.staffID = numberOfStaff;
        numberOfStaff++;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getCustomerID() {
        return staffID;
    }

    public void setCustomerID(int customerID) {
        this.staffID = customerID;
    }

    public static int getNumberOfCustomers() {
        return numberOfStaff;
    }

    @Override
    public String toString() {
        return super.toString() + " Staff ID: " + staffID + " Role: " + role.toString();
    }

}