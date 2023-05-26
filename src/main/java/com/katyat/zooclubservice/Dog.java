package com.katyat.zooclubservice;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats meat!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Bark!");
    }
}
