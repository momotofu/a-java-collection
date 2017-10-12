package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        Cat cat = new Cat(7);

        // what happens when..
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            doggy.sleep();
        }
        doggy.sleep();
    }
}
