package com.bridgelabz;

public class SnakeAndLadder {
    static final int STARTING_POSITION = 0;
    static final int WINNING_POSITION = 100;
    static final int NO_PLAY = 0;
    static final int IS_SNAKE = 1;
    static final int IS_LADDER = 2;

    static int diceRoll() {
        int x = (int) (1+ Math.random() * 6);
        return x;
    }
    static int getOption() {
        int x = (int) (Math.random() * 3);
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");

        int playerPosition = STARTING_POSITION;

        int diceCount=0;

        while (playerPosition < WINNING_POSITION){
            int roll=diceRoll();
            diceCount++;
            System.out.println(roll);

        int option = getOption();

        switch (option) {
            case IS_SNAKE:
                System.out.println("Snake");
                playerPosition -= roll;
                if (playerPosition<STARTING_POSITION)
                    playerPosition=STARTING_POSITION;
                break;
            case IS_LADDER:
                System.out.println("Ladder");
                playerPosition += roll;
                if(playerPosition > WINNING_POSITION)
                    playerPosition -= roll;
                break;
            default:
                System.out.println("No play");
        }
            System.out.println("Dice count:" +diceCount);
            System.out.println("  ,Player position:" +playerPosition);
        }
        System.out.println("Total Dice Count:" +diceCount);
    }
}
