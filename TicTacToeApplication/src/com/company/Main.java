package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Getting input
        Scanner sc = new Scanner(System.in);

        Boolean playing = true;

        while(playing) {
            // Setting up tokens and Ai
            System.out.println("Welcome to Tic Tac Toe! " +
                    " You are about to go against the Master of Tic Tac Toe!\n");
            System.out.println();
            System.out.println("Pick your single character");

            char playerToken = sc.next().charAt(0);

            System.out.println("Pick your opponent's single character");
            char AiToken = sc.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, AiToken);
            Ai ai = new Ai();

            // Set up the game
            System.out.println();
            System.out.println("Let's begin.");
            System.out.println("To play, press a number between 1 and 9 and your token will" +
                    " be put in it's place \n");
            game.printIndexBoard();

            // Start game loop
            while (game.gameOver().equals("It's not over yet!")) {
                if (game.currentMarker == game.userMarker) {
                    // User's turn
                    System.out.println("It's your turn. Pick a number carefully...");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again. " + spot + " is invalid.  ");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot);
                } else {
                    // Ai's turn
                    System.out.println("Now I will pick.");
                    int spot = ai.pickSpot(game.getBoard());
                    game.playTurn(spot);
                    System.out.println("I chose " + spot + ".");
                }
                // Print new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();

            // Set up a new game or not depending on the response
        }
    }
}
