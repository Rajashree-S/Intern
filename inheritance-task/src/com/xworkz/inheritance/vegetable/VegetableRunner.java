package com.xworkz.inheritance.vegetable;

import com.xworkz.inheritance.vegetable.Carrot.Carrot;
import com.xworkz.inheritance.vegetable.vegetabledetails.Vegetables;

import java.net.CacheRequest;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetables vegetable = new Vegetables();
        vegetable.vegetableName();
        vegetable.vegetableType();
        vegetable.vegetableColor();
        vegetable.vegetableTaste();
        vegetable.vegetableNutrients();

        Vegetables vegetable1 = new Carrot();
        vegetable1.vegetableFunction();
        vegetable1.vegetableName();
        vegetable1.vegetableType();
        vegetable1.vegetableColor();
        vegetable1.vegetableTaste();

        Carrot carrot = new Carrot();
        carrot.carrotShape();
        carrot.carrotSize();
        carrot.carrotTaste();
        carrot.carrotColor();
        carrot.carrotUse();
    }
}
