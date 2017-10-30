package com.company;

public interface Tree<D extends Comparable> {
    // Signatures
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D el);
    public NonEmptyBST<D> add(D el);
}
