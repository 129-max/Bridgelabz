package com.example.demo;
    import java.util.Random;

    public class check_play_dice extends Snake_ladder {
        static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

        static int getOption() {
            Random random = new Random();
            return random.nextInt(3);
        }

        public static void main(String[] args) {
            int position = new snack().Position;
            switch (getOption()) {
                case NOPLAY -> {
                }
                case SNAKE -> position -= getDiceRoll();
                case LADDER -> position += getDiceRoll();
                default -> throw new IllegalStateException("Unexpected value: " + getOption());
            }
            System.out.println("Player position = "+position);

        }
    }

