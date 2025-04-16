package com.xworkz.inheritance.instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.instrumentName();
        instrument.instrumentType();
        instrument.instrumentMaterial();
        instrument.instrumentSound();
        instrument.instrumentOrigin();

        Instrument instrument1 = new Guitar();
        instrument1.instrumentName();
        instrument1.instrumentType();
        instrument1.instrumentMaterial();
        instrument1.instrumentSound();
        instrument1.instrumentOrigin();

        Guitar guitar = new Guitar();
        guitar.guitarStrings();
        guitar.guitarBrand();
        guitar.guitarBodyShape();
        guitar.guitarTuning();
        guitar.guitarPlayStyle();


    }
}
