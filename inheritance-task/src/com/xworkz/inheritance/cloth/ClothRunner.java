package com.xworkz.inheritance.cloth;

import com.xworkz.inheritance.cloth.clothdetails.Cloth;
import com.xworkz.inheritance.cloth.jeans.Jeans;

public class ClothRunner {

    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.clothBrand();
        cloth.clothColor();
        cloth.clothMaterial();
        cloth.clothSize();
        cloth.clothType();

        Cloth cloth1 = new Jeans();
        cloth1.clothBrand();
        cloth1.clothColor();
        cloth1.clothMaterial();
        cloth1.clothSize();
        cloth1.clothType();

        Jeans jeans = new Jeans();
        jeans.jeansBrand();
        jeans.jeansColor();
        jeans.jeansFit();
        jeans.jeansSize();
        jeans.jeansStyle();


    }
}
