package com.springboot.bankapp.entity;

public class Account {
    String firstName;
    String lastName;
    double accountBalance;
    String phoneNumber;
    String accountNumber;

    public Account(String firstName, String lastName, double accountBalance, String phoneNumber, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = 0;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
