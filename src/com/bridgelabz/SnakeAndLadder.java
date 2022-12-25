package com.bridgelabz;

public class SnakeAndLadder {
    static final int STARTING_POSITION = 0;
    static final int WINNING_POSITION = 100;
    static final int NO_PLAY = 0;
    static final int IS_SNAKE = 1;
    static final int IS_LADDER = 2;
    static final int playerPosition=STARTING_POSITION;

    static int diceCount = 0;

    static int diceRoll() {
        int x = (int) (1 + Math.random() * 6);
        return x;
    }

    static int getOption() {
        int x = (int) (Math.random() * 3);
        return x;
    }

    static int getToss() {
        int x = (int) (Math.random() * 2);
        return x;
    }

    static int playGame(int playerPosition) {
        int roll = diceRoll();
        diceCount++;
        System.out.println(roll);

        int option = getOption();
        switch (option) {
            case IS_SNAKE:
                System.out.println("Snake");
                playerPosition -= roll;
                if (playerPosition < STARTING_POSITION)
                    playerPosition = STARTING_POSITION;
                break;
            case IS_LADDER:
                System.out.println("Ladder");
                playerPosition += roll;
                if (playerPosition > WINNING_POSITION)
                    playerPosition -= roll;
                break;
            default:
                System.out.println("No play");

        }
        System.out.print("Dice count : " + diceCount);
        System.out.println("  , Player position : " + playerPosition);

        if (option == IS_LADDER) {
            playGame(playerPosition);
        }

        return playerPosition;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");

        int player1Position = STARTING_POSITION;
        int player2Position = STARTING_POSITION;

        int toss = getToss();

        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {

            if (toss == 0) {
                System.out.println("PLAYER 1 IS ROLLING");
                player1Position = playGame(player1Position);
                toss = 1;
            } else {
                System.out.println("PLAYER 2 IS ROLLING");
                player2Position = playGame(player2Position);
                toss = 0;
            }
            if (player1Position == WINNING_POSITION) {
                System.out.println("Player-1 is winner");
                break;
            }
            if (player2Position == WINNING_POSITION) {
                System.out.println("Player-2 is winner");
                break;
            }


        }
    }
}
