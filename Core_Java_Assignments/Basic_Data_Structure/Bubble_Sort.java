package com.Basic_Data_Structure;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] num = {40, 13, 33, 76, 45, 69, 97};

        for (int i = 0; i<num.length; i++){
            int flag = 0;
            for (int j = 0; j<num.length-i-1; j++) {
                if(num[j]>num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    flag =1;

                }
                if (flag == 0) {
                    break;
                }
            }
            for (i =0; i<num.length; i++) {
                System.out.println(num[i]);
            }
        }

    }
}
