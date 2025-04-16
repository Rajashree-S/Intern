package com.xworkz.inheritance.leather;

import com.xworkz.inheritance.leather.jacket.Jacket;
import com.xworkz.inheritance.leather.leatherdetails.Leather;

public class LeatherRunner {
    public static void main(String[] args) {
        Leather leather = new Leather();
        leather.leatherType();
        leather.leatherColor();
        leather.leatherTexture();
        leather.leatherOrigin();
        leather.leatherDurability();

        Leather leather1 = new Jacket();
        leather1.leatherType();
        leather1.leatherColor();
        leather1.leatherTexture();
        leather1.leatherOrigin();
        leather1.leatherDurability();

        Jacket jacket = new Jacket();
        jacket.jacketSize();
        jacket.jacketBrand();
        jacket.jacketStyle();
        jacket.jacketZipperType();
        jacket.jacketPrice();
    }
}
