package com.company;

import java.util.Random;

public class Testers {

    public static int randomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static Tree randomTree(int size) {
        if (size == 0) {
            return new EmptyBST();
        } else {
            return randomTree(size - 1).add(randomInt(0, 50));
        }

    }

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

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        // if a new tree was added then cardinality should increase
        // otherwise if the data already existed then cardinality should remain the same
        int resultingCard = (t.add(x)).cardinality();

        if (resultingCard == t.cardinality() + 1) {
            if (t.member(x)) {
                throw new Exception("Cardinality increased by one, but data already existed.");
            } else {
                System.out.println("Success: cardinality increased, and"
                                 + " item wasn't previously in the tree");
            }
        } else if (resultingCard == t.cardinality()) {
            if (!t.member(x)) {
                throw new Exception("The cardinality didn't increase, but data was added.");
            } else {
                System.out.println("Success: data was already in the tree and cardinality"
                                    + " did not increase.");
            }
        } else {
            throw new Exception("Error");
        }
    }
}
