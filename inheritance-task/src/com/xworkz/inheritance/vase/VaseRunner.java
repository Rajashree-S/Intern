package com.xworkz.inheritance.vase;

public class VaseRunner {
    public static void main(String[] args) {
        Ceramic ceramic = new Ceramic();
        ceramic.ceramicType();
        ceramic.ceramicMaterial();
        ceramic.ceramicOrigin();
        ceramic.ceramicTexture();
        ceramic.ceramicUse();

        Ceramic ceramic1 = new Vase();
        ceramic1.ceramicFunction();
        ceramic1.ceramicType();
        ceramic1.ceramicMaterial();
        ceramic1.ceramicOrigin();
        ceramic1.ceramicTexture();

        Vase vase = new Vase();
        vase.vaseShape();
        vase.vaseHeight();
        vase.vaseColor();
        vase.vaseDesign();
        vase.vaseCapacity();
    }
}
