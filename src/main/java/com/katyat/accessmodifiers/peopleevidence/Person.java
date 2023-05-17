package com.katyat.accessmodifiers.peopleevidence;

import java.util.spi.CalendarNameProvider;

public class Person {

    // This property is class related - Class Variable, it's private - it can be accessed only with the Person
    private static int totalNumberOfPersonObjects;

    // This is a instance variable, and it is declared as private - It can be accessed only from Person class
    private int age;

    // The gender and name are instance variables because they describe objects of the class
    // Public means that they can be accessed from anywhere in the project
    public String gender;
    public String name;
    //IDNP

    // The final key word describe a non access modifier which means that this property will not be changed during the execution and it hs to be initialized once the object is created.
    private final long CNP;
    public String address;

    // The protected property is can be accessed only from classes which belong to the people evidence package and subclasses
    protected String phone;

    // The default property is can be accessed only from classes which belong to the people evidence
    double height;
    String eyeColor;
    double weight;
    String education;
    String nationality;
    boolean isMarried;

    String readingBook;
    String emailAddress;
    String occupation;

    //There is a constructor with only one parameter that is mandatory field
    public Person(long CNPObligatoriuLaCreare) {
        this.CNP = CNPObligatoriuLaCreare;
        totalNumberOfPersonObjects++;
    }

    //There is a constructor with multiple parameters that contains the mandatory CNP field too
    public Person(long CNP, String name, boolean isMarried, int age) {
        this.CNP = CNP;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;
        totalNumberOfPersonObjects++;
        // totalNumberOfPersonObjects +=1;
        // totalNumberOfPersonObjects = totalNumberOfPersonalObject +1;
    }

    public static void printNumberOfPeople() {
        System.out.println("Numarul total de persoane este = " + totalNumberOfPersonObjects);

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", nationality='" + nationality + '\'' +
                ", isMarried=" + isMarried +
                ", readingBook='" + readingBook + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
