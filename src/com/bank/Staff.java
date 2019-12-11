package com.bank;
import java.util.Date;
import java.util.HashMap;

public class Staff extends Person {

    private Integer staffID;
    private static int numberOfStaff = 1000;
    private Role role;
    private static HashMap<Integer, Staff> staffs = new HashMap<>();

    public Staff(String name, Date dob, Role role) {
        super(name, dob);
        this.role = role;
        this.staffID = numberOfStaff;
        numberOfStaff++;
        staffs.put(this.staffID, this);

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public static int getNumberOfStaff() {
        return numberOfStaff;
    }

    public static HashMap<Integer, Staff> getStaff() {
        return staffs;
    }

    public static void removeStaff(Staff staff)
    {
        if (staffs.containsValue(staff)) {
            staffs.remove(staff);
        }
    }

    public static Staff findStaff(Integer staffID)
    {
        return staffs.getOrDefault(staffID, null);
    }

    @Override
    public String toString() {
        return super.toString() + " Staff ID: " + staffID + " Role: " + role.toString();
    }

}