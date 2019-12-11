package com.bank;
import java.util.Date;
import java.util.ArrayList;

public class Customer extends Person {

    private int customerID;
    private static int numberOfCustomers = 1000;
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    public Customer(String name, Date dob) {
        super(name, dob);
        this.customerID = numberOfCustomers;
        numberOfCustomers++;
        customers.add(this);
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

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void removeCustomer(Customer customer)
    {
        customers.remove(customer);
    }




    @Override
    public String toString() {
        return super.toString() + " Customer ID: " + customerID;
    }
}
