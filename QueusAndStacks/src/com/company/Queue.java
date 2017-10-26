package com.company;

import java.util.LinkedList;

public class Queue<T> {
    // Properties
    LinkedList<T> queue;

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

    public void enqueue(T n) {
        queue.addLast(n);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public T peek() {
        return queue.getFirst();
    }
}
