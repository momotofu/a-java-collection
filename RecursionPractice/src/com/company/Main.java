package com.company;

public class Main {

    public static int summation(int n) {
        // base case
        if (n <= 0) {
            return 0;
        } else {
            // recursive case
            return n + summation(n - 1);
        }
    }

    public static int factorial(int n) {
        // base case
        if (n <= 1) {
            return 1;
        } else {
            // recursive case
            return n * factorial(n - 1);
        }
    }

    public static int power(int n, int p) {
        // base case
        if (p <= 0) {
            return 1;
        } else {
            // recursive case
            return n * power(n, p - 1);
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(convertFromBaseTenToBinary(2));
    }

    public static int convertFromBaseTenToBinary(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            int nums = number % 2;
            return Integer.parseInt(Integer.toString(nums) + convertFromBaseTenToBinary(number / 2));
        }
    }
}
