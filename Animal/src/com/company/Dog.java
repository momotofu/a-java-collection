package com.company;

public class Dog extends Animal {

    public Dog() {
        super(15);
        System.out.println("A dog has been created.");
    }

    public void bark() {
        System.out.println("The dog says, わんわん！");
    }
}
