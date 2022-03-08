package com.oops;

public class TestBank {

    public static void main(String[] args) {
        Saving_Account s1 = new Saving_Account("Ravi", 10000,5000);
        System.out.println("Cash in Saving_Account" + " "+ "$"+s1.getCash());

        Current_Account c1 = new Current_Account("Ravi",20000,5000);
        System.out.println("Cash in Current_Account" + " "+"$"+c1.getCash());

        Object total_cash = s1.getCash() + c1.getCash();
        System.out.println("Total cash in bank" + " " +"$"+total_cash);
    }
}
