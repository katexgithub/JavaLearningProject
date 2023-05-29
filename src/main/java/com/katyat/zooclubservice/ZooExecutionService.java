package com.katyat.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal buddyDog = new Dog("Buddy");

        System.out.println("the name of the object buddyDog is: " + buddyDog.getName());
        buddyDog.setName("Buddy Vaccined");
        System.out.println("updated name buddyDog is: " + buddyDog.getName());

        buddyDog.eat();
        buddyDog.makeSound();

        AnimalInterface teddyDog = new Dog("Teddy");
        teddyDog.makeSound();

        Dog maxDog = new Dog("Max");
        maxDog.eat();
        maxDog.makeSound();

        Cat lucyCat = new Cat("Lucy");
        lucyCat.eat();
        lucyCat.makeSound();

        Horse spiritHorse = new Horse("Spirit");
        spiritHorse.eat();
        spiritHorse.makeSound();
    }
}
