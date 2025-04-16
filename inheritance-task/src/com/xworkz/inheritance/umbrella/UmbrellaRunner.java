package com.xworkz.inheritance.umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Nylon nylon = new Nylon();
        nylon.nylonType();
        nylon.nylonColor();
        nylon.nylonStrength();
        nylon.nylonDurability();
        nylon.nylonUsage();

        Nylon nylon1 = new Umbrella();
        nylon1.nylonFunction();
        nylon1.nylonType();
        nylon1.nylonColor();
        nylon1.nylonStrength();
        nylon1.nylonDurability();

        Umbrella umbrella = new Umbrella();
        umbrella.umbrellaType();
        umbrella.umbrellaSize();
        umbrella.umbrellaHandle();
        umbrella.umbrellaColor();
        umbrella.umbrellaUsage();
    }
}
