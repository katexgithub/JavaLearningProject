package com.katyat.zooclubservice;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "eat the mouse");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says: Meow, Meow!");
    }
}