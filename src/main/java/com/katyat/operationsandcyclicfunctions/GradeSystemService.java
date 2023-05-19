package com.katyat.operationsandcyclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 98;

        if (testResult >= 90) {
            System.out.println("Rating A");
        } else if (testResult >= 80) {
            System.out.println("Rating B");
        } else if (testResult >= 70) {
            System.out.println("Rating C");
        } else if (testResult >= 60) {
            System.out.println("Rating D");
        } else {
            System.out.println("Un astfel de calificativ nu este definit");
        }

        System.out.println("Programul sa terminat");
    }
}
