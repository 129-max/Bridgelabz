package com.example.demo;

public class fibbo {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.print("Enter the num to get fibonacci series up to n :");
        int n = utility.getIntValue();
        utility.getFibonacci(n);

    }

}
