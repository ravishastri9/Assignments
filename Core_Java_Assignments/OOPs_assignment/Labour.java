package com.oops;

public class Labour extends Employee{
    int overtime;

    public Labour() {
        super();
        overtime = 0;
    }

    public Labour(String n, int sal, int ov) {
        super(n,sal);
        overtime = ov;
    }
    public int getSalary() {
        return (super.getSalary()+overtime);
    }
}
