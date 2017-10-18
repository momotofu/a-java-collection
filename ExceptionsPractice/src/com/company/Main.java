package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[10];
        System.out.println(array);

        // Exceptions safe guard your code against bad input
        try {
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 is: " + c[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            System.out.println("Finally finished try catch");
        }
    }
}
