package com.company;

import java.text.MessageFormat;
import java.util.Optional;
import java.util.Random;

public class TicTacToe {

    // Properties
    protected char[] board;
    protected char userMarker;
    protected char AiMarker;
    protected char winner;
    protected char currentMarker;

    // Constructor
    public TicTacToe(char userMarker, char AiMarker) {
        this.userMarker = userMarker;
        this.AiMarker = AiMarker;
        this.winner = '-';
        this.board = setBoard();
        Random rand = new Random();
        this.currentMarker = rand.nextInt() % 2 == 0 ? userMarker : AiMarker;
    }

    // Getters
    public char[] getBoard() {
        return this.board;
    }

    public char[] setBoard() {
        char[] board = new char[9];

        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }

        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = isInRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = currentMarker == AiMarker ? userMarker : AiMarker;
        }
        return isValid;
    }

    public boolean isInRange(int number) {
        return 0 < number && board.length + 1 > number;
    }

    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-';
    }

    public void printBoard() {
        System.out.println();

        for (int i = 0; i < getBoard().length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print("|");
                System.out.println();
                System.out.println("-------------");
            }
            System.out.print("| " + board[i] + " ");
        }
        System.out.print("|");
        System.out.println();
        System.out.println();
    }

    public void printIndexBoard() {
        System.out.println();

        for (int i = 0; i < getBoard().length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print("|");
                System.out.println();
                System.out.println("-------------");
            }
            System.out.print("| " + (i + 1) + " ");
        }
        System.out.print("|");
        System.out.println();
        System.out.println();
    }

    public boolean isThereAWinner() {
        boolean diagonalsAndMiddle = (rightDia() || leftDia() || secondRow() || secondCol()) && board[4] != '-';
        boolean leftTop = (firstCol() || firstRow()) && board[0] != '-';
        boolean rightBottom = (thirdCol() || thirdRow()) && board[8] != '-';

        if (diagonalsAndMiddle) {
            winner = board[4];
        } else if (leftTop) {
            winner = board[0];
        } else {
            winner = board[8];
        }

        return diagonalsAndMiddle || leftTop || rightBottom;
    }

    public boolean rightDia() {
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean leftDia() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean firstRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean secondRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean thirdRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondCol() {
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean isBoardFilled() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public String gameOver() {
        if (isThereAWinner()) {
            return "We have a winner! The winner is " + this.winner + "'s";
        } else if (isBoardFilled()) {
            return "It's a draw!";
        } else {
            return "It's not over yet!";
        }
    }
}

