package com.katyat.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/com/katyat/filemanagementservice/test.txt");

        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);

        InputFileReadManager.readDataFromTextFile(demoFile);
        InputFileReadManager.readDataFromATextFileUsingFileReader(demoFile);
        System.out.println();
        InputFileReadManager.readDataFromFileUsingBufferedReader(demoFile);

        String contentForTheFile = "New content for BB \n another line";
        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, contentForTheFile);
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Another text");

        InputFileReadManager.readDataFromTextFile(demoFile);

    }
}
