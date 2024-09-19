package com.datorium.Datorium.API;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGuessingGameTests {

    // My test 1 when the guess is correct
    @Test
    void CorrectGuess() {
        // Arrange (Set up the game with target number 3)
        NumberGuessingGame game = new NumberGuessingGame(3);

        // Act (Guess the number 3)
        int result = game.guess(3);

        // Assert (Check if the result is 1, which means the guess was correct)
        assertEquals(1, result, "The guess supposed to be correct (1)");
    }

    // My test 2 when the guess is too big
    @Test
    void GuessTooBig() {
        // Arrange
        NumberGuessingGame game = new NumberGuessingGame(77);

        // Act (Guess the number 100, which is too big)
        int result = game.guess(100);

        // Assert (Check if the result is 3, meaning the guess was too big)
        assertEquals(3, result, "The guess supposed to be too big (3)");
    }

    // My test 3 when the guess is too small
    @Test
    void GuessTooSmall() {
        // Arrange
        NumberGuessingGame game = new NumberGuessingGame(33);

        // Act (Guess the number 11, which is too small)
        int result = game.guess(11);

        // Assert (Check if the result is 11, meaning the guess was too small)
        assertEquals(2, result, "The guess should be too small (2)");
    }
}
