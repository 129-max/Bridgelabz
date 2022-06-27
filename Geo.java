package com.example.demo;

public class Geo {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(3, 5));
        System.out.println(Math.min(3, 5));
        System.out.println(Math.sqrt(4));
        int absoluteValue = Math.abs(-5);
        System.out.println(absoluteValue);

        System.out.println(Math.sqrt(-1));
        System.out.println(2 / 12);
        System.out.println((97 / 10) + 5);

        System.out.println(5 / 55);
        System.out.println(5 / 66);

        System.out.println(Math.round(20.0 / 3.0));						// 7
        System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67

        System.out.println(Math.random());						// between 0.0 and 1.0
        System.out.println((int)(Math.random() * 100)); 		// between 0 and 100
        System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200

    }

}