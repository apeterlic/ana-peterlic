package com.peterlic.files;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadExample {
    public static void main(String[] args) {

        String filePath = "files/item_apple.dat";

        Item item = readFromFile(filePath);
        System.out.println(item);

    }

    public static Item readFromFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            return (Item) obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
