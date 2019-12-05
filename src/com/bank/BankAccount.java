package com.bank;

public class BankAccount {

    private long accountNumber;
    private double amount;
    private Customer customer;

    private static int numberOfAccounts = 0;

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public BankAccount(long accountNumber, double amount, Customer customer)
    {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.customer = customer;
        numberOfAccounts++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public void deposit(double amount)
    {
        this.amount += amount;
    }

    public void withdraw(double amount)
    {
        if (amount <= this.amount)
        {
            this.amount -= amount;
        }

    }

      public double getBalance()
    {
        return amount;
    }
    public void transfer(double amount, BankAccount targetAccount)
    {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }
}