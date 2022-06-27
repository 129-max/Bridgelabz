package com.example.demo;

public class quard {

        public static void main(String[] args) {

            Funcprog utility = new Funcprog();
            System.out.print("Enter value of a : ");
            int a = utility.getIntValue();
            System.out.print("Enter value of b : ");
            int b = utility.getIntValue();
            System.out.print("Enter value of c : ");
            int c = utility.getIntValue();
            utility.getRoots(a, b, c);

        }

    }

