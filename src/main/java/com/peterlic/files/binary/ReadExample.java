package com.peterlic.files.binary;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Represents a class used for reading objects from binary files.
 *
 * @author Ana Peterlic
 * @since 09/03/2022
 */
class ReadExample {
    public static void main(String[] args) {

        // path to our file
        String filePath = "binary_files/item.dat";

        Item item = readFromFile(filePath);
        System.out.println(item);

    }

    public static Item readFromFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            return (Item) obj;
        } catch (Exception e) {
            System.err.println("Error - " + e);
            return null;
        }
    }
}
