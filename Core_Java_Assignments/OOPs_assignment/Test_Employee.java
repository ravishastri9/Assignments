package com.oops;

public class Test_Employee {
    public static void main(String[] args) {
        Manager m1 = new Manager("Ravi",20000,5000);
        System.out.println("Salary of Manager" +" "+ m1.getSalary());

        Labour l1 = new Labour("Golu",12000,1200);
        System.out.println("Salary of Labour" + " "+ l1.getSalary());

    }
}
