package com.peterlic.util;

import java.io.File;

public class FileUtils {

    private FileUtils() {
    }

    public static void getFileNames() {
        File folder = new File("files");
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                System.out.println("File " + fileName);
            }
        }
    }
}
