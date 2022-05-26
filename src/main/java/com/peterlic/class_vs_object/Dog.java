package com.peterlic.class_vs_object;

/**
 * @author Ana Peterlic
 */
public class Dog {

    private String name;
    private String type;
    private double age;
    private String color;

    public Dog(String name, String type, double age, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.color = color;
    }

    public void bark() {
        System.out.println("Wuf");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void play() {
        System.out.println("Playing is super fun");
    }

    // getters and setters

    public void eat() {
        System.out.println("Om nom nom");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
