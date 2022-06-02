package com.peterlic.files.text;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.UUID;

public class PrintWriterObjectDemo {
    public static void main(String[] args) {
        String filePath = "files/order.txt";
        Order order = new Order(UUID.randomUUID(), 50.85);

        try (FileWriter fileWriter = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(order);
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }
}

// utorak, 07.06. u 16h