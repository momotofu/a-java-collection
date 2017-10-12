package com.company;

public abstract class Animal {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(int age) {
        setAge(age);
        System.out.println("An animal object has been created.");
    }

    public void sleep() {
        System.out.println("An animal is sleeping.");
    }

    public abstract void eat();
}
