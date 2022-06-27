package com.example.demo;
    public class dicewin extends check_play_dice {
        static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

        public static void main(String[] args) {
            int position = new snack().Position;
            int cnt = 0;

            while(position < 100) {

                int diceroll = getDiceRoll();

                switch (getOption()) {
                    case NOPLAY -> {
                    }
                    case SNAKE -> position -= diceroll;
                    case LADDER -> position += diceroll;
                    default -> throw new IllegalStateException("Unexpected value: " + getOption());
                }

                if(position < 0) {
                    position = 0;
                }
                else if(position > 100 ) {
                    position -= diceroll;
                }
                cnt++;
                System.out.println("position of player = "+position);
            }
            System.out.println("Number of dice required to win = "+cnt);

        }
    }
