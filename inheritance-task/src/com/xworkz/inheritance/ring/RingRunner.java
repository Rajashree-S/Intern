package com.xworkz.inheritance.ring;

public class RingRunner {
    public static void main(String[] args) {
        Jewelry jewelry = new Jewelry();
        jewelry.jewelryType();
        jewelry.jewelryMaterial();
        jewelry.jewelryOrigin();
        jewelry.jewelryWeight();
        jewelry.jewelryPrice();

        Jewelry jewelry1 = new Ring();
        jewelry1.jewelryFunction();
        jewelry1.jewelryType();
        jewelry1.jewelryMaterial();
        jewelry1.jewelryOrigin();
        jewelry1.jewelryWeight();

        Ring ring = new Ring();
        ring.ringSize();
        ring.ringShape();
        ring.ringStone();
        ring.ringBandMaterial();
        ring.ringOccasion();
    }
}
