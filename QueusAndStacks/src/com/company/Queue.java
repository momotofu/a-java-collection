package com.company;

import java.util.LinkedList;

public class Queue {
    // Properties
    LinkedList queue;

    // Constructor
    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(int n) {
        queue.addLast(n);
    }

    public int dequeue() {
        return (int) queue.removeFirst();
    }

    public int peek() {
        if (!isEmpty()) {
            return (int) queue.getFirst();
        } else {
            return -1;
        }
    }
}
