package com.company;

import java.util.ArrayList;

public class Ai {

    public void pickSpot(char[] board) {
          ArrayList<Integer> arrayList = new ArrayList();

          for (int i = 0; i < board.length; i++) {
              if (board[i] == '-') {
                  arrayList.add(i);
              }
          }


    }
}
