package com.bank;
import java.util.Date;
import java.util.HashMap;

public class Customer extends Person {

    private Integer customerID;
    private static int numberOfCustomers = 1000;
    private static HashMap<Integer, Customer> customers = new HashMap<>();

    public Customer(String name, Date dob) {
        super(name, dob);
        this.customerID = numberOfCustomers;
        numberOfCustomers++;
        customers.put(this.customerID,this);
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

    public static HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

    public static void removeCustomer(Customer customer)
    {
        if (customers.containsValue(customer)) {
            customers.remove(customer);
        }
    }

    public static Customer findCustomer(Integer customerID)
    {
        return customers.getOrDefault(customerID, null);
    }

    @Override
    public String toString() {
        return super.toString() + " Customer ID: " + customerID;
    }
}
