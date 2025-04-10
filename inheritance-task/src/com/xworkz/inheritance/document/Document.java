package com.xworkz.inheritance.document;

public class Document {
    public String name;
    public String type;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    public void get() {
        System.out.println("Hi from Document class!");
    }
}
