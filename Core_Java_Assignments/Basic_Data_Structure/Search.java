package com.Basic_Data_Structure;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        int number[] = {4, 5, 6, 7, 19, 67, 45, 46, 90, 78, 34, 56};
        int flag = 0;

        System.out.println("Enter the number to search: " );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == num) {
                System.out.println("Number found at index " + i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Number not found");
        }

    }
}
