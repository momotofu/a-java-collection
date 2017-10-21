package com.company;

import java.util.Stack;

public class Main {
    public static void puts(Object obj) {
        System.out.println(obj);
    }

    public static String putsOpposite(String string) {
        Stack<String> stack = new Stack<String>();
        String output = "";

        // Add to stack
        for (int i = 0; i < string.length(); i++) {
            stack.push(Character.toString(string.charAt(i)));
        }

        // Pop from stack getting reverse ordered string
        while (!stack.isEmpty()) {
            output += stack.pop();
        }

        return output;
    }

    public static void main(String[] args) {
	// write your code here
        // FIFO & LIFO
//        Queue Q = new Queue();
//
//        puts(Q.isEmpty());
//        Q.enqueue(5);
//        Q.enqueue(9);
//        Q.enqueue(6);
//        Q.enqueue(1);
//        puts(Q.peek());
//        puts(Q.dequeue());
//        puts(Q.size());

        // LIFO
//         Stack stack = new Stack();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         puts("size of stack: " + stack.size());
//         stack.push(4);
//         stack.push(5);
//         puts("peek: " + stack.peek());
//         puts("pop: " + stack.pop());
//         puts("pop: " + stack.pop());
//         puts("pop: " + stack.pop());
//         puts("pop: " + stack.pop());
//         puts("pop: " + stack.pop());
        puts(putsOpposite("Hello World"));
        puts(putsOpposite("Oyasumi"));
        puts(putsOpposite("Mizuho"));
    }
}
