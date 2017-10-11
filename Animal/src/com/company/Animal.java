package com.company;

public class Animal {
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

    public void eat() {
        System.out.println("An animal is eating.");
    }
}
