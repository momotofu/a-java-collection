package com.company;

public class Testers {

    public static boolean checkIsEmpty(Tree t) throws Exception {
        // if instance of t is an EmptyBST then it should return true
        // otherwise it should return false

        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("EmptyBST should return true");
            } else {
                return false;
            }
        }

        return false;
    }
}
