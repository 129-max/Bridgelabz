package com.example.demo;


public class monthof {
    public static void main(String[] args) {
        day6 utility = new day6();
        System.out.print("Enter the no of years : ");
        int years = utility.getIntValue();
        System.out.print("Enter the principle amount : ");
        int P = utility.getIntValue();
        System.out.print("Enter the percent amount : ");
        int R = utility.getIntValue();
        day6.getMonthlyPayment(years, P, R);
    }
}
