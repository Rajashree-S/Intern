package com.xworkz.inheritance.gadget;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();
        gadget.gadgetName();
        gadget.gadgetBrand();
        gadget.gadgetType();
        gadget.gadgetBatteryLife();
        gadget.gadgetWarranty();

        Gadget gadget1 = new Tablet();
        gadget1.gadgetName();
        gadget1.gadgetBrand();
        gadget1.gadgetType();
        gadget1.gadgetBatteryLife();
        gadget1.gadgetWarranty();

        Tablet tablet = new Tablet();
        tablet.tabletScreenSize();
        tablet.tabletStorage();
        tablet.tabletOS();
        tablet.tabletResolution();
        tablet.tabletPrice();
    }

}

