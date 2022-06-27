package com.example.demo;
    public class twodiceplayer extends check_play_dice {
        static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

        public static void main(String[] args) {
            int position1 = new snack().Position;
            int position2 = new snack().Position;
            int position = 0, diceroll;
            boolean player1 = true;

            while((position1 < 100) && (position2 < 100)) {
                diceroll = getDiceRoll();

                switch (getOption()) {
                    case NOPLAY -> {
                    }
                    case SNAKE -> position -= diceroll;
                    case LADDER -> {
                        position += diceroll;
                        continue;
                    }
                }
                if( position > 0) {
                    if (player1) {
                        position1 += position;
                        position = 0;
                        player1 = false;
                    }
                    else {
                        position2 += position;
                        position = 0;
                        player1 = true;
                    }
                }

                else {
                    position = 0;
                }

            }
            if(position1>position2) {
                System.out.println("player1 is the winner");
            }
            else {
                System.out.println("player2 is the winner");
            }
        }
    }

