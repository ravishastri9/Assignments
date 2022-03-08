package com.oops;

public class Manager extends Employee {
    int incentive;

    public Manager() {
        super();
        incentive = 0;
    }
    public Manager(String n, int sal, int in) {
        super(n, sal);
        incentive = in;
    }

    public int getSalary() {

        return (super.getSalary()+incentive);
    }
}
