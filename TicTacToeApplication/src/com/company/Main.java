package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TicTacToe game = new TicTacToe('A', 'B');
        System.out.println(game.setBoard());
        game.printBoard();
    }
}
