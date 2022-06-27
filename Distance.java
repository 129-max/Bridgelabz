package com.example.demo;

public class Distance {

    public static void main(String[] args) {

        Funcprog utility = new Funcprog();
        System.out.print("Enter point x : ");
        int x = utility.getIntValue();
        System.out.print("Enter point y : ");
        int y = utility.getIntValue();
        utility.getEuclidianDist(x, y);
    }

}
