package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        Boolean playing = true;

        while(playing) {
            System.out.println("Welcome to Tic Tac Toe! " +
                    " You are about to go against the Master of Tic Tac Toe!\n");
            System.out.println();
            System.out.println("Pick your single character");

            char playerToken = sc.next().charAt(0);

            System.out.println("Pick your opponent's single character");
            char AiToken = sc.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, AiToken);
            Ai ai = new AI();
        }
    }
}
