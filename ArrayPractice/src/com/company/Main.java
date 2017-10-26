package com.company;

import java.util.Arrays;

public class Main {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
	// write your code here

        int[] array1;
        int[] array2 = new int[4];
        int[] array3 = {5, 2, 3, 9, 1};

        String[] stringArray1 = {"bananas", "apples", "oranges", "mangos", "kiwis"};
        printArray(array3);
    }
}
