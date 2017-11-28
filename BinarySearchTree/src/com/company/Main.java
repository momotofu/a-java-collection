package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        EmptyBST e = new EmptyBST();
        NonEmptyBST f = new NonEmptyBST(10);

        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(f);
    }
}
