package com.bridgelabz;

public class SnakeAndLadder {
    static final int STARTING_POSITION = 0;
    static final int WINNING_POSITION = 100;
    static final int playersPosition= STARTING_POSITION;
    static int diceRoll() {
        int x = (int) (1+ Math.random() * 6);
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");
        System.out.println("Starting position of player is :"+playersPosition);
        System.out.println(diceRoll());
    }
}
