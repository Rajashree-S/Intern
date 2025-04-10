package com.xworkz.inheritance.bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird base = new Bird();
        base.name = "Bird Example";
        base.type = "General";
        base.display();
        base.get();

        Parrot sub = new Parrot();
        sub.name = "Parrot Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
