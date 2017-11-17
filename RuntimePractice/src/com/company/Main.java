package com.company;

import javax.lang.model.type.ArrayType;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class Main {

    public static int findNumberOfRepititions(String s, char c) {
        // Linear time O(n)
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum += 1;
            }
        }
        return sum;
    }

    public static int[] findNumberOfRepetitionsV1(String s, char[] c) {
        // Quad time O(n * m)
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                sums[j] = sums[j] + 1;
            }
        }
        return sums;
    }

    public static int[] findNumberOfRepetitionsV2(String s, char[] c) {
       // Optimal time O(n + m)
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        return sums;
    }

    public static void main(String[] args) {
	// write your code here

        char[] a = {'a', 'b', 'c'};

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        findNumberOfRepetitionsV2("hello", a);
        long duration = endTime - startTime;
        System.out.println("Duration: " + duration + "ms");
    }
}
