package com.xworkz.inheritance.fruit;

import com.xworkz.inheritance.appliance.appfunction.Appliance;
import com.xworkz.inheritance.fruit.apple.Apple;
import com.xworkz.inheritance.fruit.fruitdetails.Fruit;

public class FruitRunner {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.fruitName();
        fruit.fruitColor();
        fruit.fruitTaste();
        fruit.fruitSeason();
        fruit.fruitType();

        Fruit fruit1 = new Apple();
        fruit1.fruitName();
        fruit1.fruitColor();
        fruit1.fruitTaste();
        fruit1.fruitSeason();
        fruit1.fruitType();

        Apple apple = new Apple();
        apple.appleVariety();
        apple.appleOrigin();
        apple.appleSugarContent();
        apple.appleTexture();
        apple.appleUse();
    }
}
