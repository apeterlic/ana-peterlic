package com.peterlic.files.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.UUID;

public class BufferedWriterDemo {

    public static void main(String[] args) {
        String filePath = "files/buffered_writer.txt";

        Order order = new Order(UUID.randomUUID(), 50.85);

        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(order.getOrderNumber().toString());
            bufferedWriter.write(" ");
            bufferedWriter.write(String.valueOf(order.getPrice()));
            bufferedWriter.newLine();
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }
}
