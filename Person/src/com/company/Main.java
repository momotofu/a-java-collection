package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person PeterParker = new Person();
        Person SpiderMan = PeterParker;

        System.out.println("Hair color of Peter Parker is: " + PeterParker.hairColor);
        System.out.println("Hair color of Spiderman is: " + SpiderMan.hairColor);
    }
}
