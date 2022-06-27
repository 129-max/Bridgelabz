package com.example.demo;
    public class rrepeation extends check_play_dice {
        static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

        public static void main(String[] args) {
            int position = new snack().Position;


            while (position < 100) {
                int diceroll = getDiceRoll();
                switch (getOption()) {
                    case NOPLAY -> {
                    }
                    case SNAKE -> position -= diceroll;
                    case LADDER -> position += diceroll;
                }

                if (position < 0) {
                    position = 0;
                } else if (position > 100) {
                    position -= diceroll;
                }
                System.out.println("position = " + position);
            }

        }
    }
