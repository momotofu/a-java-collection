package com.company;

public class TicTacToe {

    // Properties
    protected char[] board;
    protected char userMarker;
    protected char AiMarker;
    protected char winner;
    protected char currentMarker;

    // Constructor
    public TicTacToe(char userMarker, char AiMarker) {
        self.userMarker = userMarker;
        self.AiMarker = AiMarker;
        self.winner = '-';
        self.setBoard();
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
}

