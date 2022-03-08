package com.Basic_Data_Structure;

public class Simple_Compound_Interest {
    public static void main(String[] args) {

        // Simple Interest
        double SI;
        int p = 5000;
        double r = 4.5;
        double t = 2.5;

        SI = p * r * t / 100; // Simple Interest Calculation

        // Compound Interest
        int A = 10000;
        int P = 5000;
        double R = 5.5;
        double T = 1.5;

        A = (int) (P * Math.pow((1 + 5.5 / 100), 1.5)); // Compound Interest Calculation

        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + A);

    }
}
