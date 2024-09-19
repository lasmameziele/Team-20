package com.datorium.Datorium.API;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGuessingGameTests {

    // Test when the guess is correct
    @Test
    void testCorrectGuess() {
        // Arrange (Set up the game with target number 5)
        NumberGuessingGame game = new NumberGuessingGame(5);

        // Act (Guess the number 5)
        int result = game.guess(5);

        // Assert (Check if the result is 1, which means the guess was correct)
        assertEquals(1, result, "The guess should be correct (1)");
    }

    // Test when the guess is too big
    @Test
    void testGuessTooBig() {
        // Arrange
        NumberGuessingGame game = new NumberGuessingGame(5);

        // Act (Guess the number 10, which is too big)
        int result = game.guess(10);

        // Assert (Check if the result is 3, meaning the guess was too big)
        assertEquals(3, result, "The guess should be too big (3)");
    }

    // Test when the guess is too small
    @Test
    void testGuessTooSmall() {
        // Arrange
        NumberGuessingGame game = new NumberGuessingGame(5);

        // Act (Guess the number 2, which is too small)
        int result = game.guess(2);

        // Assert (Check if the result is 2, meaning the guess was too small)
        assertEquals(2, result, "The guess should be too small (2)");
    }
}
