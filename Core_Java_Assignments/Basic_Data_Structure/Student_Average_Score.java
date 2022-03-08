package com.Assignment_1;

import java.util.Scanner;

public class Student_Average_Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Student1 in respective A,B and C Subjects");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int total1 = a1 + b1 + c1;
        System.out.println("Enter the marks of Student2 in respective A,B and C Subjects");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int total_2 = a2 + b2 + c2;
        System.out.println("Enter the marks of Student3 in respective A,B and C Subjects");
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        int total_3 = a3 + b3 + c3;
        int total = total1 + total_2 + total_3;
        int average = total/9;
        System.out.println("Total:" +total);
        System.out.println("Average:" +average);
        int sum1 = a1+b1+c1;
        int avg1 = sum1/3;
        int sum2 = a2+b2+b3;
        int avg2 = sum2/3;
        int sum3 = a3+b3+c3;
        int avg3 = sum3/3;
        System.out.println("Total and Average in Subject A:" +sum1 +" " + avg1);
        System.out.println("Total and Average in Subject B:" +sum2 +" " + avg2);
        System.out.println("Total and Average in Subject C:" +sum3 +" " + avg3);





    }
}
