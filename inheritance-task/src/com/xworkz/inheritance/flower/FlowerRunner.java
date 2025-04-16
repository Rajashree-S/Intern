package com.xworkz.inheritance.flower;

import com.xworkz.inheritance.flower.flowerchar.Flower;
import com.xworkz.inheritance.flower.rose.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.flowerColor();
        flower.flowerName();
        flower.flowerScent();
        flower.flowerSeason();
        flower.flowerType();

        Flower flower1 = new Rose();
        flower1.flowerColor();
        flower1.flowerName();
        flower1.flowerScent();
        flower1.flowerSeason();
        flower1.flowerType();

        Rose rose = new Rose();
        rose.roseColor();
        rose.roseFragrance();
        rose.roseSymbolism();
        rose.roseThorns();
        rose.roseVariety();
    }
}
