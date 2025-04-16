package com.xworkz.inheritance.toothbrush;

public class ToothbrushRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.plasticType();
        plastic.plasticColor();
        plastic.plasticOrigin();
        plastic.plasticDurability();
        plastic.plasticRecyclability();

        Plastic plastic1 = new Toothbrush();
        plastic1.plasticFunction();
        plastic1.plasticType();
        plastic1.plasticColor();
        plastic1.plasticOrigin();
        plastic1.plasticDurability();

        Toothbrush toothbrush = new Toothbrush();
        toothbrush.brushType();
        toothbrush.brushBristles();
        toothbrush.brushColor();
        toothbrush.brushBrand();
        toothbrush.brushUsage();

    }
}
