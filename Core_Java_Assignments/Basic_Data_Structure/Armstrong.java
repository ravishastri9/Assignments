package com.Basic_Data_Structure;
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int r,sum =0;
        while(n>0)
        {
            r = n%10;
            n=n/10;
            sum=sum + r*r*r;
        }

        if(temp == sum)
            System.out.println("Its an Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

    }
}

