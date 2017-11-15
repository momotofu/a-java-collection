package com.company;

import java.util.Scanner;

public class Main {

    public static void puts(Object input) {
        if (input == null) { input = "";}
        System.out.println(input);
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    puts("Welcome to Hangman!");

    }
}
