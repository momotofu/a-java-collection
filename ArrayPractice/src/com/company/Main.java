package com.company;

import java.util.Arrays;

public class Main {

    public static void printArray(int[] array) {
        String outPut = "[";

        for (int i = 0; i < array.length; i++) {
            outPut += array[i];

            if (i == array.length - 1) {
                outPut += "]";
            } else {
                outPut += ", ";
            }
        }
        System.out.println(outPut);
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
