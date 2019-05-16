package com.zjaktheron;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
