package com.example.demo;

public class VendingMcalc {
    public static void main(String[] args) {
        day6 utility = new day6();
        System.out.print("Enter the amount : ");
        int amount = utility.getIntValue()
                ;		int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1 };
        day6.getRupeeNotesCount(amount, notes);



    }
}
