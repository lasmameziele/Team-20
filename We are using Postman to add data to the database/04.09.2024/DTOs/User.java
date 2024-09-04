package com.datorium.Datorium.API.DTOs;

public class User {
    public String name;
    public String pin;
    public double balance;

    // Constructors
    public User() {
    }

    public User(String name, String pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
