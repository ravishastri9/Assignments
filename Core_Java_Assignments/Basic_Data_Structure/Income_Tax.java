package com.Basic_Data_Structure;

import java.util.Scanner;
public class Income_Tax {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income");
        income = sc.nextInt();

        if (income <= 180000) {
            System.out.println("Tax: Nil");
        } else if (income <= 300000) {
            System.out.println("Tax: 10%");
        } else if (income <= 500000) {
            System.out.println("Tax: 20%");
        } else if (income <= 1000000) {
            System.out.println("Tax: 30%");
        }
    }

}
