package com.company;

public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST() {

    }

    public boolean isEmpty() {
        return true;
    }

    public int cardinality() {
        return 0;
    }
}
