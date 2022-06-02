package com.peterlic.files.text;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Ana Peterlić
 */
class BufferedReaderDemo {

    public static void main(String[] args) {
        String filePath = "files/order.txt";
        Order order = readFromFile(filePath);
        System.out.println(order);
    }

    public static Order readFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String row;
            while ((row = br.readLine()) != null) {
                System.out.println(row);
            }

        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
        return null;
    }

}
