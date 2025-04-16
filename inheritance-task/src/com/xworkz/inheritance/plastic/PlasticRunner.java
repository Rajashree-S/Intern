package com.xworkz.inheritance.plastic;

import com.xworkz.inheritance.plastic.bottle.Bottle;
import com.xworkz.inheritance.plastic.plasticfunctions.Plastic;


public class PlasticRunner {

    public static void main(String[] args) {

                Plastic plastic = new Plastic();
                plastic.plasticType();
                plastic.plasticOrigin();
                plastic.plasticUse();
                plastic.plasticRecyclable();
                plastic.plasticDurability();

                Plastic plastic1 = new Bottle();
                plastic1.plasticFunction();
                plastic1.plasticType();
                plastic1.plasticOrigin();
                plastic1.plasticUse();
                plastic1.plasticRecyclable();

                Bottle bottle = new Bottle();
                bottle.bottleSize();
                bottle.bottleShape();
                bottle.bottleColor();
                bottle.bottleCapType();
                bottle.bottleMaterial();
            }
}




