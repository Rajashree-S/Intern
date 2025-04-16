package com.xworkz.inheritance.spoon;

public class SpoonRunner {
    public static void main(String[] args) {
        Metal metal = new Metal();
        metal.metalName();
        metal.metalType();
        metal.metalOrigin();
        metal.metalConductivity();
        metal.metalDurability();

        Metal metal1 = new Spoon();
        metal1.metalFunction();
        metal1.metalName();
        metal1.metalType();
        metal1.metalOrigin();
        metal1.metalConductivity();

        Spoon spoon = new Spoon();
        spoon.spoonType();
        spoon.spoonSize();
        spoon.spoonWeight();
        spoon.spoonFinish();
        spoon.spoonUsage();
    }
}
