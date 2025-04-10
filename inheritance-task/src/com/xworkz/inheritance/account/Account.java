package com.xworkz.inheritance.account;

public class Account {
    public String name;
    public String type;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

    public void get() {
        System.out.println("Hi from Account class!");
    }
}
