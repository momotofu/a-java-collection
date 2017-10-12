package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        Cat cat = new Cat(7);

        dog.bark();
        cat.meow();
        cat.eat();
        dog.eat();
        dog.run();
        cat.prance();
        cat.getAge();
        dog.getAge();
    }
}
