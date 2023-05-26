package com.katyat.zooclubservice;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats grass and hay!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Neigh!");
    }
}
