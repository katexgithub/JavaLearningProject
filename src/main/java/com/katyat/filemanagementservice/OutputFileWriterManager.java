package com.katyat.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {
    public static void writeDataIntoFileWithFileWriter(File file, String content) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("There has been found exception: " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeDataIntoFileWithBufferedWriter(File file, String content) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
