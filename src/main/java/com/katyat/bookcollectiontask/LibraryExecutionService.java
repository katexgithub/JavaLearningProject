package com.katyat.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {

    public static void main(String[] args) {
        Book bookCrimeAndPunishmentBook = new Book("Crime And Punishment", "Fyodor D.");
        Book bookInvisibleMan = new Book("Invisible Man", "Ralph E.");
        Book bookHamlet = new Book("Hamlet", "William S.");
        Book bookUncleVanya = new Book("Uncle Vanya", "Anton C.");

//        System.out.println(bookCrimeAndPunishmentBook.getTitle());
//        System.out.println(bookInvisibleMan.getTitle());
//        System.out.println(bookHamlet.getTitle());
//        System.out.println(bookUncleVanya.getTitle());

        Library classicLibrary = new Library("Vatican Library");

        classicLibrary.addBook(bookCrimeAndPunishmentBook);
        classicLibrary.addBook(bookInvisibleMan);
        classicLibrary.addBook(bookHamlet, bookCrimeAndPunishmentBook);

        classicLibrary.printAllTheBooks();

        System.out.println("1. Numarul de carti este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook(3);

        classicLibrary.removeBook(bookUncleVanya);

        System.out.println("2. Numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook("Invisible Man");

        System.out.println("3. Numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.printAllTheBooks();

        Library universityLibrary = new Library("University");

        universityLibrary.addBook(bookHamlet, bookHamlet);
        universityLibrary.addBook(bookUncleVanya, bookInvisibleMan);
        universityLibrary.addBook(bookCrimeAndPunishmentBook);

        System.out.println(universityLibrary.returnNumberBooks());

        Map<String, Library> librariesNetwork = new HashMap<>();

        librariesNetwork.put("Vatican City", classicLibrary);
        librariesNetwork.put("Str. M. Kogalniceanu", universityLibrary);

        librariesNetwork.get("Str. M. Kogalniceanu").addBook(bookInvisibleMan);
        librariesNetwork.get("Vatican City").printAllTheBooks();
        librariesNetwork.get("Vatican City").addBook(bookHamlet);
        librariesNetwork.get("Vatican City").printAllTheBooks();

        librariesNetwork.get("Vatican City").addAnotherListOfBooksIntoTheLibraryList(universityLibrary.getBookList());
        librariesNetwork.get("Vatican City").printAllTheBooks();

    }
}
