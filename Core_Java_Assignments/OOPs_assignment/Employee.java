package com.oops;

public class Employee {
    String name;
    int salary;

    public Employee() {
        name = null;
        salary = 0;
    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
