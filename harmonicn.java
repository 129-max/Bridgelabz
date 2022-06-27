package com.example.demo;

class harmonicn {
        static double nthHarmonic(int N)
        {
            float harmonic = 1;
            for (int i = 2; i <= N; i++) {
                harmonic += (float)1 / i;
            }

            return harmonic;
        }
        

        public static void main (String[] args) {
            int N = 12;

            System.out.print(nthHarmonic(N));

        }
    }



