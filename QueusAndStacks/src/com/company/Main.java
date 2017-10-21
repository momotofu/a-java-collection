package com.company;

public class Main {
    public static void puts(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
	// write your code here
        Queue Q = new Queue();

        puts(Q.isEmpty());
        Q.enqueue(5);
        Q.enqueue(9);
        Q.enqueue(6);
        Q.enqueue(1);
        puts(Q.peek());
        puts(Q.dequeue());
        puts(Q.size());
    }
}
