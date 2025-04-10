package com.xworkz.inheritance.gadget;

public class Gadget {
    public String name;
    public String type;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    public void get() {
        System.out.println("Hi from Gadget class!");
    }
}
