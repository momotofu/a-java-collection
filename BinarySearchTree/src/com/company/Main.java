package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmptyBST e = new EmptyBST();
        NonEmptyBST f = new NonEmptyBST(10);

        System.out.println(Testers.checkIsEmpty(e));
        System.out.println(Testers.checkIsEmpty(f));
    }
}
