package com.oops;

public class Saving_Account extends Bank {
    private int fixed_deposit;

    public Saving_Account() {
        super();
        fixed_deposit = 0;
    }
    public Saving_Account(String n, int c, int fd) {
        super(n, c);
        fixed_deposit = fd;
    }

    public int getCash() {
        return (super.getCash()+fixed_deposit);
    }
}
