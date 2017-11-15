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
	    Scanner scanner = new Scanner(System.in);
	    puts("Welcome to Hangman!");
	    puts("I will pick a word. If you can guess that word in six your less tries you win.");
	    puts("Are you ready?");
	    puts();

    }
}
