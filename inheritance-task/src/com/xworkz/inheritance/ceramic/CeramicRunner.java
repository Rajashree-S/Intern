package com.xworkz.inheritance.ceramic;

import com.xworkz.inheritance.ceramic.ceramicdetails.Ceramic;
import com.xworkz.inheritance.ceramic.cup.Cup;

public class CeramicRunner {
    public static void main(String[] args) {
        Ceramic ceramic = new Ceramic();
        ceramic.ceramicColor();
        ceramic.ceramicMaterial();
        ceramic.ceramicOrigin();
        ceramic.ceramicType();
        ceramic.ceramicUsage();

        Ceramic ceramic1 = new Cup();
        ceramic1.ceramicColor();
        ceramic1.ceramicMaterial();
        ceramic1.ceramicOrigin();
        ceramic1.ceramicType();
        ceramic1.ceramicUsage();

        Cup cup = new Cup();
        cup.cupColor();
        cup.cupMaterial();
        cup.cupPurpose();
        cup.cupSize();
        cup.cupHandleType();

    }
}
