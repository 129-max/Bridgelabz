package com.example.demo;

public class Daily_Wage extends Emp_attendence {

    public static int Wager() {

        int WagePerHr = 20, FullDayHr = 8;
        return WagePerHr * FullDayHr;
    }

    public static void main(String[] args) {

        int attendance = Attendance();

        int isPresent = 1, isAbsent = 0;

        if (attendance == isPresent) {

            System.out.print("Employee Daily wager = "+Wager());
        }

        else {

            System.out.println("Employee Daily Wager = "+isAbsent);
        }
    }

}