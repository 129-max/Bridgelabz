package com.example.demo;

public class windchill {
        public static void main(String[] args) {
            Funcprog utility = new Funcprog();
            System.out.print("Enter tempreture in t in Fahrenheit : ");
            double t = utility.getDoubleValue();
            System.out.print("Enter wind speed v in miles per hour : ");
            double v = utility.getDoubleValue();
            utility.getWindChill(t, v);
        }

    }

