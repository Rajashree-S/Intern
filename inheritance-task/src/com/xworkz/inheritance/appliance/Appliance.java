package com.xworkz.inheritance.appliance;

public class Appliance {
    public String name;
    public String type;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    public void get() {
        System.out.println("Hi from Appliance class!");
    }
}
