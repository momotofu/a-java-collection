package com.company;

public class Main {

    public static int summation(int n) {
        // base case
        if (n <= 0) {
            return 0;
        } else {
            return n + summation(n - 1);
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
