package com.xworkz.inheritance.toy;

public class ToyRunner {
    public static void main(String[] args) {

        Toy toy = new Toy();
        toy.toyName();
        toy.toyMaterial();
        toy.toyColor();
        toy.toyAgeGroup();
        toy.toyPrice();

        Toy toy1 = new TeddyBear();
        toy1.toyFunction();
        toy1.toyName();
        toy1.toyMaterial();
        toy1.toyColor();
        toy1.toyAgeGroup();

        TeddyBear teddy = new TeddyBear();
        teddy.teddySize();
        teddy.teddyFurType();
        teddy.teddySound();
        teddy.teddyColorOptions();
        teddy.teddyBrand();
    }
}
