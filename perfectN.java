package com.example.demo;


public class perfectN {
    public static void main(String[] args) {
        day6 utility = new day6();
        System.out.print("Enter the num to check perfect num or not : ");
        int n = utility.getIntValue();
        utility.checkPerfectNum(n);
    }

}
