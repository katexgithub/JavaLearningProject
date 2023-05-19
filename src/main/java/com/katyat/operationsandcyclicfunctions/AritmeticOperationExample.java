package com.katyat.operationsandcyclicfunctions;

public class AritmeticOperationExample {

    public static void main(String[] args) {
        int a = 45;
        int c = 4;

        //Sum
        int sum = a + c;
        System.out.println("Suma: " + sum);
        System.out.println("Suma: " + (a + c));

        //Subtraction
        int sub = a - c;
        System.out.println("Resultatul: " + sub);

        //Multiplication
        int result = a * c;
        System.out.println("Imultirea: " + result);

        //Division
        result = a / c;
        System.out.println("Impartirea: " + result);

        //The rest of Division or Division with remainder
        result = a % c;
        System.out.println("Impartirea: " + result);
    }
}
