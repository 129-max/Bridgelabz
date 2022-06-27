package com.example.demo;

import static java.lang.Math.*;

class power2 {
        static boolean isPowerOfTwo(int n)
        {
            return (int)(ceil((log(n) / log(2))))
                    == (int)(floor(((log(n) / log(2)))));
        }


        public static void main(String[] args)
        {
            if (isPowerOfTwo(25))
                System.out.println("Yes");
            else
                System.out.println("No");

            if (isPowerOfTwo(64))
                System.out.println("Yes");
            else System.out.println("No");
        }
    }




