package com.katyat.bookcollectiontask;

public class Main {
    public static void main(String[] args) {
        int[] dataTableInt = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 6, 6, 6};

        System.out.println(IntNumberArrayService.getTheMinValueOfTheArray(dataTableInt));
        System.out.println(IntNumberArrayService.getTheMinValueIndexOfTheArray(dataTableInt));
        System.out.println(IntNumberArrayService.getTheAverageOfTheElements(dataTableInt));
    }
}
