package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        EmptyBST e = new EmptyBST();
        NonEmptyBST f = new NonEmptyBST(1);

        System.out.println(f.cardinality());
        f.add(2);
        f.add(3);
        System.out.println(f.cardinality());
        System.out.println(f.right);
        System.out.println(f.left);

//        Testers.checkAddMemberCardinality(e, 5);
//        Testers.checkAddMemberCardinality(f, 5);
//        Testers.checkAddMemberCardinality(f, 6);

//        int tests = 1000;
//        for (int i = 0; i < tests; i++) {
//            Tree t;
//            if (i % 10 == 0) {
//                t = Testers.randomTree(0);
//            } else {
//                t = Testers.randomTree(10);
//            }
//
//            Testers.checkAddMemberCardinality(t, i);
//        }
    }
}
