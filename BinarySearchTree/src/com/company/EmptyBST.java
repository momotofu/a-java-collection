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

    public boolean member(D el) {
        return false;
    }

    public NonEmptyBST<D> add(D el) {
        return new NonEmptyBST<D>(el);
    }
}
