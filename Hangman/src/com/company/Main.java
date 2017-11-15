package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void puts(Object input) {
        System.out.println(input);
    }

    public static void puts() {
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        // Properties
        boolean isPlaying = true;
        boolean isReady = false;

        // Game instructions
	    Scanner scanner = new Scanner(System.in);
	    puts("Welcome to Hangman!");
	    puts("I will pick a word. If you can guess that word in six your less tries you win.");
	    puts("Are you ready?");
        puts();
        puts("Type Y for Yes or N for No.");
        puts();

        while(!isReady) {
            isReady = (scanner.next().toUpperCase().charAt(0) == 'Y');
        }

        // Enter game loop
        while (isPlaying) {
            puts();
            puts("Lets get started!");

            HangmanGame game = new HangmanGame();

            do {
                puts();
                puts(game.drawPicture());
                puts();
                puts(game.getFormalCurrentGuess());
                puts(game.mysteryWord);

                // get user guess
                char guess = scanner.next().toLowerCase().charAt(0);

                while (!game.checkGuess(guess)) {
                    puts("Whoops. Looks like you've already guessed that letter.");
                    puts("Try again please.");
                    puts();
                    guess = scanner.next().toLowerCase().charAt(0);
                } else {
                    if (game.submitGuess(guess)) {
                        puts("You guessed wisely.");
                    } else {
                        puts("You guessed poorly.");
                    }
                }
            } while (!game.gameOver());

            // prompt the user for another game
            puts("Do you want to play another game?"
            + " Enter Y for yes or N for No.");

            // Exit or continue game loop
            Character answer = scanner.next().toUpperCase().charAt(0);
            isPlaying = (answer == 'Y');
        }
    }
}
