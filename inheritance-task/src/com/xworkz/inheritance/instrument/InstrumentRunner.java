package com.xworkz.inheritance.instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        Instrument base = new Instrument();
        base.name = "Instrument Example";
        base.type = "General";
        base.display();
        base.get();

        Guitar sub = new Guitar();
        sub.name = "Guitar Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
