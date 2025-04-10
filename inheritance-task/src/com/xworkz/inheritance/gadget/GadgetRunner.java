package com.xworkz.inheritance.gadget;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget base = new Gadget();
        base.name = "Gadget Example";
        base.type = "General";
        base.display();
        base.get();

        Tablet sub = new Tablet();
        sub.name = "Tablet Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
