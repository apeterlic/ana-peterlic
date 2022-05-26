package com.peterlic.files.binary;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

/**
 * Represents a class used for writing objects in a binary com.peterlic.files.
 *
 * @author Ana Peterlic
 * @since 09/03/2022
 */
class WriteExample {

    public static void main(String[] args) {
        // path to file
        String filePath = "binary_files/item.dat";

        // creating an Item object
        Item item = new Item("123456", "Apple", BigDecimal.valueOf(15.8));

        writeToFile(item, filePath);
    }

    public static void writeToFile(Item item, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            // calling writeObject method and passing item as an argument
            objectOut.writeObject(item);
        } catch (Exception e) {
            System.err.println("Error - " + e);
        }
    }

}
