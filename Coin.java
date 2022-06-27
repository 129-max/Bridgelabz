package com.example.demo;

public class Coin
    {
        public static void main(String[] args)
        {
            int loopCount = 1;
            double result;
            double heads = 0.0;
            while(loopCount <= 10)
            {
                result = Math.random();
                if(result <= .5){
                    System.out.println("Thelt is heads.");
                    heads += 1;
                }
                else
                    System.out.println("Thelt is tails.");
                loopCount = loopCount + 1;
            }
            double percentHeads = heads/10*100;
            double percentTails = (10-heads)/10*100;
            System.out.println("theentage of heads is: " +percentHeads);
            System.out.println("theentage of tails is: " +percentTails);
        }
    }

