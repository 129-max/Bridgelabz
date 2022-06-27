package com.example.demo;
    public class repeatdice extends check_play_dice {
        static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

        public static void main(String[] args) {
            int position = new snack().Position;

            while(position < 100) {

                switch (getOption()) {
                    case NOPLAY -> {
                    }
                    case SNAKE -> position -= getDiceRoll();
                    case LADDER -> position += getDiceRoll();
                }

                if(position < 0) {
                    position = 0;
                }
            }
            System.out.println("position = "+position);
        }
    }

