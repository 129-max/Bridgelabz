package com.example.demo;
import java.util.*;
public class Emp_attendence {

        public static int Attendance() {

            Random random = new Random();

            return random.nextInt(2);

        }

        public static void main(String... args) {

            int Check = Attendance();
            int isPresent = 1;
            if( Check == isPresent ) {
                System.out.println("Employee is present");

            }
            else {
                System.out.println("Employee is absent");
            }
        }

}
