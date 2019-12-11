package com.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Tester {

    public Tester() throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Customer c1 = new Customer("Simon West", df.parse("30/07/1986"));
        Customer c2 = new Customer("Sam West", df.parse("30/07/1992"));
        Staff s1 = new Staff("David", df.parse("30/06/1990"), Role.MANAGER);

        System.out.println(Staff.findStaff(1000).toString());

    }
}
