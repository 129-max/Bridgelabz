package com.example.demo;

public class oddeven {

        public static void main(String[] args) {
            Utility utility = new Utility();
            System.out.print("Enter the number to check even & odd : ");
            int Number = utility.getIntValue();
            utility.getEvenOdd(Number);
        }

    }

