package com.peterlic.files.text;

import java.io.FileReader;

public class FileReaderDemo {

    public static void main(String[] args) {
        String filePath = "files/order.txt";

        try (FileReader br = new FileReader(filePath)) {

            int i;
            while ((i = br.read()) != -1) {
                System.out.println((char)i);
            }

        } catch (Exception e) {
            System.err.println("Error - " + e);
        }

    }
}
