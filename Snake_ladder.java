package com.example.demo;
import java.util.*;

public class Snake_ladder {

        static int getDiceRoll() {
            int Dice_min = 1, Dice_max = 6;
            Random random = new Random();
            return random.nextInt(Dice_max) + Dice_min;
        }
        public static void main(String[] args) {
            System.out.println(getDiceRoll());
        }
    }
