package com.company;

public class Generics {

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if ( n < 0) return b;
        else return a;
    }
}
