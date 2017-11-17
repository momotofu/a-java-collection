package com.company;

public class Main {

    public static int findNumberOfRepititions(String s, char c) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum += 1;
            }
        }
        return sum;
    }

    public static int[] findNumberOfRepititionsV1(String s, char[] c) {
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {
            
        }
    }

    public static void main(String[] args) {
	// write your code here
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration: " + duration + "ms");
    }
}
