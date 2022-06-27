package com.example.demo;

public class sumoftwo {


        public static void main(String[] args) {
            Funcprog utility = new Funcprog();
            System.out.print("Enter the length of array n : ");
            int n = utility.getIntValue();
            int[] array = utility.getArray(n);
            utility.getSumAddZero(array, n);
        }

    }

