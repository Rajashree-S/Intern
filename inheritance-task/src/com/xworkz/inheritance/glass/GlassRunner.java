package com.xworkz.inheritance.glass;

import com.xworkz.inheritance.glass.glassdetails.Glass;
import com.xworkz.inheritance.glass.window.Window;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.glassType();
        glass.glassThickness();
        glass.glassTransparency();
        glass.glassMaterial();
        glass.glassManufacturer();

        Glass glass1 = new Window();
        glass1.glassType();
        glass1.glassThickness();
        glass1.glassTransparency();
        glass1.glassMaterial();
        glass1.glassManufacturer();

        Window window = new Window();
        window.windowSize();
        window.windowFrameMaterial();
        window.windowDesign();
        window.windowType();
        window.windowColor();
    }
}
