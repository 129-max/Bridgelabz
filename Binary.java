package com.example.demo;

public class Binary {
    public static void main(String[] args) {
        day6 utility = new day6();
        System.out.print("Enter the number: ");
        int number = utility.getIntValue();
        int newNumber = Utility.swapNibbles(number);
        System.out.println("After swapping nibbles new numbers = "+newNumber);
        Utility.isPowerOfTwo(newNumber);


    }

}
