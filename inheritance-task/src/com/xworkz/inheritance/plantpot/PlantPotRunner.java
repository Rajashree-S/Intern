package com.xworkz.inheritance.plantpot;

public class PlantPotRunner {
    public static void main(String[] args) {
        Ceramic ceramic = new Ceramic();
        ceramic.ceramicType();
        ceramic.ceramicOrigin();
        ceramic.ceramicUse();
        ceramic.ceramicMaterial();
        ceramic.ceramicDurability();

        Ceramic ceramic1 = new PlantPot();
        ceramic1.ceramicType();
        ceramic1.ceramicOrigin();
        ceramic1.ceramicUse();
        ceramic1.ceramicMaterial();

        PlantPot pot = new PlantPot();
        pot.potSize();
        pot.potShape();
        pot.potColor();
        pot.potDrainage();
        pot.potWeight();
    }
}
