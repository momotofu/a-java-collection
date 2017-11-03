package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Ai {

    public int pickSpot(char[] board) {
          ArrayList<Integer> choices = new ArrayList();

          for (int i = 0; i < board.length; i++) {
              if (board[i] == '-') {
                  choices.add(i + 1);
              }
          }

          Random rand = new Random();
          return choices.get(Math.abs(rand.nextInt() % choices.size()));
    }
}
