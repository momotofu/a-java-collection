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
        System.out.println("data: " + el.toString());
    }

    public NonEmptyBST(D data, Tree<D> leftTree, Tree<D> rightTree) {
        this.data = data;
        this.left = leftTree;
        this.right = rightTree;
    }

    // comply with Tree interface
    public boolean isEmpty() {
        return false;
    }

    public int cardinality() {
        System.out.println("cardinality called");
        return 1 + left.cardinality() + right.cardinality();
    }

    public boolean member(D el) {
        if (data == el) {
            return true;
        } else {
            if (el.compareTo(data) < 0) {
                return left.member(el);
            } else {
                return right.member(el);
            }
        }
    }

    public NonEmptyBST<D> add(D el) {
        if (el == data) {
            return this;
        } else {
            if (el.compareTo(data) < 0) {
                System.out.println("added left");
                return new NonEmptyBST<D>(data, left.add(el), right);
            } else {
                System.out.println("added right");
                return new NonEmptyBST<D>(data, left, right.add(el));
            }
        }
    }
}
