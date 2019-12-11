package com.bank;
import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person {

    private int staffID;
    private static int numberOfStaff = 1000;
    private Role role;
    private static ArrayList<Staff> staffs = new ArrayList<Staff>();

    public Staff(String name, Date dob, Role role) {
        super(name, dob);
        this.role = role;
        this.staffID = numberOfStaff;
        numberOfStaff++;
        staffs.add(this);
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

    public static ArrayList<Staff> getStaff() {
        return staffs;
    }

    public static void removeStaff(Staff staff)
    {
        staffs.remove(staff);
    }


    @Override
    public String toString() {
        return super.toString() + " Staff ID: " + staffID + " Role: " + role.toString();
    }

}