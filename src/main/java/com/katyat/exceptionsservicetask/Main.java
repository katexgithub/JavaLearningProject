package com.katyat.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result2 = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result2);
        System.out.println("The program is running till the end");

        String stringValue = "Lory";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/katyat/exceptionsservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("File does not exist, the execution of the programme is not interrupted ");

        } finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);

        System.out.println("The program is running");
    }
}
 