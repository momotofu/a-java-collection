package com.company;

public class Testers {

    public static boolean checkIsEmpty(Tree t) {
        // if instance of t is an EmptyBST then it should return true
        // otherwise it should return false

        if (t instanceof EmptyBST) {
            if (t.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
