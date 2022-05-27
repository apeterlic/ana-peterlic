package com.peterlic.files.text;

import java.io.FileWriter;
import java.util.UUID;

/**
 * Represents Java program that writes data in the file using {@link FileWriter} class.
 *
 * @author Ana Peterlic
 */
public class FileWriterDemo {

    public static void main(String[] args) {
        String filePath = "files/file_writer.txt";

        Order order = new Order(UUID.randomUUID(), 50.85);

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(order.getOrderNumber().toString());
            fileWriter.write(" ");
            fileWriter.write(String.valueOf(order.getPrice()));
            fileWriter.write("\n");
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }
}
