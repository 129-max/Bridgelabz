package com.example.demo;

import com.example.demo.ParttimeWage.Part_timeWage;

import java.util.Random;

import static com.example.demo.Daily_Wage.Wager;

class SwitchCase extends Part_timeWage
{


    public static final int isFulltime = 1, isParttime = 2;

    public static int Switch() {

        Random randome = new Random();
        return randome.nextInt(3);
    }
    public static void main(String[] args) {

        int check = Switch();

        switch (check) {
            case isFulltime ->                    // full time wage

                    System.out.println("Employee Full day Wager = " + Wager());
            case isParttime ->                                                        // part time wage

                    System.out.println("Employee Part time Wager = " + ParttimeWage());
            default -> System.out.println("Employee is Absent");               //Absent
        }

    }

    private static String ParttimeWage() {
        return null;
    }

}
