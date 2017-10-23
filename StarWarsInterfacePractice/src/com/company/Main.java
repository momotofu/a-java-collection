package com.company;

import java.util.Random;

public class Main {

    public static Character summonCharacter() {
        Random rand = new Random();

        if (rand.nextInt() % 2 == 0) {
            return new Hero();
        } else {
            return new Enemy();
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
