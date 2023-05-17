package com.katyat.accessmodifiers;

import com.katyat.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person andreiBuzu = new Person(54125654644L);
        andreiBuzu.address = "Alexandru cel Bun 3";
        andreiBuzu.gender = "Masculin";
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(464555682668L, "Mihai Eminescu", false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person vasileBuhnici = new Person(464559682668L, "Vasile Buhnici", false, 37);
        vasileBuhnici.gender = "Masculin";
        vasileBuhnici.address = "Str. Avram Iancu 22";
        System.out.println(vasileBuhnici.toString());
        Person.printNumberOfPeople();

        Person elenaProfir = new Person(4645596811168L, "Elena Profir", false, 37);
        elenaProfir.gender = "Femenin";
        elenaProfir.address = "Metropolitul Bodoni 8";
        System.out.println(elenaProfir.toString());
        Person.printNumberOfPeople();
    }
}
