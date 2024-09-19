package com.datorium.Datorium.API;

public class NumberGuessingGame {
    private int targetNumber;

    // Constructor to set the target number when the game starts
    public NumberGuessingGame(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    // Method to guess the number and return the result
    public int guess(int number) {
        if (number > targetNumber) {
            return 3; // Guess is too big
        } else if (number < targetNumber) {
            return 2; // Guess is too small
        } else {
            return 1; // Guess is correct!
        }
    }
}
