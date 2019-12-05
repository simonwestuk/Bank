package com.bank;
import java.util.Date;

public class Customer extends Person {

    private int customerID;
    private static int numberOfCustomers = 1000;


    public Customer(String name, Date dob) {
        super(name, dob);
        this.customerID = numberOfCustomers;
        numberOfCustomers++;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    @Override
    public String toString() {
        return super.toString() + " Customer ID: " + customerID;
    }
}
