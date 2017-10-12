package com.company;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created.");
    }

    public void meow() {
        System.out.println("A cat says, Meow!");
    }

    public void prance() {
        System.out.println("A cat is prancing around.");
    }

    public void eat() {
        System.out.println("A cat is eating.");
    }
}
