package com.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Customer c1 = new Customer("Simon West", df.parse("30/07/1986"));
        Staff s1 = new Staff("David", df.parse("30/06/1990"));
        System.out.println(c1.toString());
        System.out.println(s1.toString());

    }
}
