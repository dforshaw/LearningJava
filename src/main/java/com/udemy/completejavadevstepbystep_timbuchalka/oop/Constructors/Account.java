package com.udemy.completejavadevstepbystep_timbuchalka.oop.Constructors;


public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {

        this("C777777", 1, "William Generico", "blank@zzz.com", "000-000-0000");

        System.out.println("Empty constructor called - use default values");
    }

    public Account(String accountNumber,
                   double balance,
                   String customerName,
                   String customerEmail,
                   String customerPhone) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

        System.out.println("Account constructor with parameter data called");

    }

    public void deposit(double depositAmount) {

        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed.  New balance = " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {

        if(this.balance - withdrawalAmount <= 0) {

            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");

        } else {

            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.  Remaining balance = " + this.balance);
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
