package com.peterlic.class_vs_object;

/**
 * @author Ana Peterlic
 */
public class Demo {

    public static void main(String[] args) {
        Dog huskey = new Dog("Tim", "Huskey", 14, "black");
        Dog chihuahua = new Dog("Lisa", "Chihuahua", 3, "white");

        huskey.bark();
        chihuahua.eat();
    }
}
