package com.oops;

public class Bank {
    private final String name;
    private final int cash;
    private int balance;

    public Bank() {
        name = null;
        cash = 0;
    }

    public Bank(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int b) {
        balance = b;
    }

}
