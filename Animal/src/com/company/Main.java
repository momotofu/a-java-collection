package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal a = new Animal(5);
        Dog dog = new Dog();
        Cat cat = new Cat(7);

        dog.bark();
        cat.meow();
        cat.eat();
        a.eat();
        dog.eat();
        dog.run();
        cat.prance();
        cat.getAge();
        dog.getAge();
        System.out.println(a.getAge());
    }
}
