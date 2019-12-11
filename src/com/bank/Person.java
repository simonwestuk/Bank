package com.bank;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  Person {

    private String name;
    private Date dob;

    protected Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        return " Name: " + name + " DOB: " + df.format(dob);
    }
}
