package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set a = new HashSet();
        a.add(1101);

        User chris = new User("chris", "password", 28, a);
    }
}
