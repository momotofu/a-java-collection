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
}
