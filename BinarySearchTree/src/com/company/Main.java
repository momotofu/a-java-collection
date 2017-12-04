package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        EmptyBST e = new EmptyBST();
        NonEmptyBST f = new NonEmptyBST(5);

        // System.out.println(f.ca[rdinality());
        // f.add(5);
        // System.out.println(f.ca[rdinality());
        // System.out.println(f.me[mber(21));
        // System.out.println(f.me[mber(5));
        // Testers.checkIsEmpty(e)[;
        // Testers.checkIsEmpty(f);

        Testers.checkAddMemberCardinality(e, 5);
        Testers.checkAddMemberCardinality(f, 5);
        Testers.checkAddMemberCardinality(f, 6);

        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t;
            if (i % 10 == 0) {
                t = Testers.randomTree(0);
            } else {
                t = Testers.randomTree(10);
            }

            Testers.checkAddMemberCardinality(t, i);
        }
    }
}
