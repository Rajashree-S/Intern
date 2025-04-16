package com.xworkz.inheritance.plant;

public class PlantRunner {
    public static void main(String[] args) {

        Plant plant = new Plant();
        plant.plantName();
        plant.plantType();
        plant.plantHeight();
        plant.plantLifespan();
        plant.plantHabitat();

        Plant plant1 = new Flower();
        plant1.plantName();
        plant1.plantType();
        plant1.plantHeight();
        plant1.plantLifespan();

        Flower flower = new Flower();
        flower.flowerName();
        flower.flowerColor();
        flower.flowerScent();
        flower.flowerSeason();
        flower.flowerType();
    }

}
