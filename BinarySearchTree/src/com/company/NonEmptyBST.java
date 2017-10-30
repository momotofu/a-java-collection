package com.company;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data;
    Tree<D> left;
    Tree<D> right;

    // Constructor
    public NonEmptyBST(D el) {
        data = el;
        left = new EmptyBST();
        right = new EmptyBST();
    }

}
