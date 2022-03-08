package com.Basic_Data_Structure;

import java.util.Scanner;

public class Armstrong_between_interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        findarmstrong(a,b);
    }

    static void findarmstrong(int a, int b) {
        for (int i = a; i <= b; i++) {
            int n = i;
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                n = n / 10;
                sum = sum + r * r * r;
            }

            if (sum == i) {
                System.out.println(sum);
            }

        }

    }
}
