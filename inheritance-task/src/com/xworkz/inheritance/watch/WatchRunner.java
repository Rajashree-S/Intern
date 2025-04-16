package com.xworkz.inheritance.watch;

public class WatchRunner {
    public static void main(String[] args) {
        Accessory accessory = new Accessory();
        accessory.accessoryType();
        accessory.accessoryMaterial();
        accessory.accessoryBrand();
        accessory.accessoryColor();
        accessory.accessoryPrice();

        Accessory accessory1 = new Watch();
        accessory1.accessoryFunction();
        accessory1.accessoryType();
        accessory1.accessoryMaterial();
        accessory1.accessoryBrand();
        accessory1.accessoryColor();

        Watch watch = new Watch();
        watch.watchType();
        watch.watchMaterial();
        watch.watchMovement();
        watch.watchSize();
        watch.watchFeatures();
    }
}
