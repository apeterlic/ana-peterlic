package com.peterlic.files.text;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.UUID;

class PrintWriterDemo {

    public static void main(String[] args) {
        String filePath = "files/order.txt";
        Order order = new Order(UUID.randomUUID(), 50.85);

        writeToFile(order, filePath);
    }

    public static void writeToFile(Order order, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.write(order.getOrderNumber().toString() + "\n");
            printWriter.write(String.valueOf(order.getPrice()));
            printWriter.print("Test");
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }
}
