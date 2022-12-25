package com.bridgelabz;

public class SnakeAndLadder {
    static final int STARTING_POSITION = 0;
    static final int WINNING_POSITION = 100;
    static final int NO_PLAY = 0;
    static final int IS_SNAKE = 1;
    static final int IS_LADDER = 2;
    static final int playersPosition= STARTING_POSITION;
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

        int playersPosition = STARTING_POSITION;

        while (playersPosition <= WINNING_POSITION){
            int roll=diceRoll();
            System.out.println(roll);

        int option = getOption();

        switch (option) {
            case IS_SNAKE:
                System.out.println("Snake");
                playersPosition -= roll;
                if (playersPosition<0)
                    playersPosition=STARTING_POSITION;
                break;
            case IS_LADDER:
                System.out.println("Ladder");
                playersPosition += roll;
                break;
            default:
                System.out.println("No play");
        }
        }
    }
}
