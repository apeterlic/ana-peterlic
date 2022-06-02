package com.peterlic.files.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BufferedReaderObjectDemo {

    public static void main(String[] args) {
        String filePath = "files/order.txt";
        List<Order> orders = readFromFile(filePath);
        System.out.println(orders);
    }

    public static List<Order> readFromFile(String filePath) {
        List<Order> orders = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String row;
            while ((row = br.readLine()) != null) {
                System.out.println(row);
                String[] data = row.split(";");
                UUID orderNumber = UUID.fromString(data[0]);
                String price = data[1];
                orders.add(new Order(orderNumber, Double.parseDouble(price)));
            }

        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
        return orders;
    }
}
