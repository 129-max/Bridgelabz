package com.example.demo;

public class PrimeN {
    public static void main(String[] args) {
        day6 utility = new day6();
        System.out.print("Enter the number to check prime or not : ");
        int n = utility.getIntValue();
        utility.checkPrimeNum(n);
    }
}

