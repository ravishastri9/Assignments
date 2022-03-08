package com.oops;

public class Current_Account extends Bank {
    private int cash_credit;

    public Current_Account() {
        super();
        cash_credit =0;
    }
    public Current_Account(String n, int c, int cc) {
        super(n, c);
        cash_credit = cc;
    }

    public int getCash() {
        return (super.getCash()+cash_credit);
    }
}
