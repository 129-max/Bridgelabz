package com.example.demo;

public class find_eq_length extends line_comp {


        public static void main(String[] args) {

            double length1, length2 ;
            System.out.println("Enter the co-ordinates of 1st line ");
            length1 = Calculet_length();
            System.out.println("Enter the co-ordinates of 1st line ");
            length2 = Calculet_length();

            String len1 = length1+" ";
            String len2 = length2+" ";
            System.out.println("Two lines are equal "+len2.equals(len1));
            //System.out.println(len2+" "+len1);

        }

    }
