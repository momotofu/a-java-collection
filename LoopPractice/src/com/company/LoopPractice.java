package com.company;

public class LoopPractice {

    public LoopPractice() {

    }

    public static void whileLoopPractice() {
        int x = 0;

        while (x < 5) {
            System.out.println("The value of x is: " + x);
            x++;
        }
    }

    public static void doWhileLoopPractice() {
        int x = 0;

        do {
            System.out.println("The value of x is: " + x);
            x++;
        } while (x < 10);
    }

    public static void forLoopPractice() {
        int y = 0;
        for (int x = 1; x < 10; x += y) {
            System.out.println("Some value: " + (x + y));
            y = x;
        }
    }

    public static void countDownFromTen() {
        for (int x = 10; x > 0; x--) {
            System.out.println(x);
        }
    }

    public static void printDoubleForLoop() {
        for (int x = 100; x > 0; x--) {
            for (int y = 100; y > 0; y--) {
                System.out.println("(" + x + " , " + y + ")");
            }
        }
    }
}
