package com.bank;
import java.util.Date;

public class Staff extends Person {

    private int staffID;
    private static int numberOfStaff = 1000;


    public Staff(String name, Date dob) {
        super(name, dob);
        this.staffID = numberOfStaff;
        numberOfStaff++;
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
        return super.toString() + " Staff ID: " + staffID;
    }

}