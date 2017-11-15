package com.company;

import java.util.Scanner;

public class Main {

    public static void puts(Object input) {
        System.out.println(input);
    }

    public static void puts() {
        System.out.println();
    }

    public static void main(String[] args) {
        // Properties
        boolean isPlaying = true;

        // Game instructions
	    Scanner scanner = new Scanner(System.in);
	    puts("Welcome to Hangman!");
	    puts("I will pick a word. If you can guess that word in six your less tries you win.");
	    puts("Are you ready?");
	    puts();

        // Enter game loop
        while (isPlaying) {
            puts();

            while (!game.gameOver()) {

            }

            // prompt the user for another game
            puts("Do you want to play another game?"
            + " Enter Y for yes or N for No.");

            // Exit or continue game loop
            Character answer = scanner.next().toUpperCase().charAt(0);
            isPlaying = (answer == 'Y');
        }
    }
}
