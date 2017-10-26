package com.company;

import java.util.Arrays;

public class Main {

    public static <E> void printArray(E[] array) {
        String output = "[";
        for (E element : array) {
            output += element.toString() + ", ";
        }
        output = output.substring(0, output.length() - 2) + "]";
        System.out.println(output);
    }

    public static void main(String[] args) {
	// write your code here

        Integer[] array1;
        Integer[] array2 = new Integer[4];
        Integer[] array3 = {5, 2, 3, 9, 1};

        String[] stringArray1 = {"bananas", "apples", "oranges", "mangos", "kiwis"};
        printArray(array3);
        System.out.println(Arrays.toString(array3));
    }
}
