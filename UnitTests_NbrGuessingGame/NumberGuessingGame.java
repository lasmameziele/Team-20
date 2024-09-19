package com.datorium.Datorium.API;

public class NumberGuessingGame {
    public int myTargetNumber;

    // Constructor to set the target nbr
    public NumberGuessingGame(int myTargetNumber) {
        this.myTargetNumber = myTargetNumber;
    }

    // Method to guess the nbr and return the result
    public int guess(int number) {
        if (number > myTargetNumber) {
            return 3; // Guess is too big
        } else if (number < myTargetNumber) {
            return 2; // Guess is too small
        } else {
            return 1; // Guess is correct!
        }
    }
}
