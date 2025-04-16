package com.xworkz.inheritance.tshirt;

public class TShirtRunner {
    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.clothType();
        cloth.clothMaterial();
        cloth.clothColor();
        cloth.clothSize();
        cloth.clothBrand();

        Cloth cloth1 = new TShirt();
        cloth1.clothFunction();
        cloth1.clothType();
        cloth1.clothMaterial();
        cloth1.clothColor();
        cloth1.clothSize();

        TShirt tshirt = new TShirt();
        tshirt.tshirtSleeveType();
        tshirt.tshirtNeckStyle();
        tshirt.tshirtPrintType();
        tshirt.tshirtFit();
        tshirt.tshirtOccasion();
    }
}
