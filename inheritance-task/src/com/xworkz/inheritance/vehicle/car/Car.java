package com.xworkz.inheritance.vehicle.car;

import com.xworkz.inheritance.vehicle.vehicledetails.Vehicles;

public class Car extends Vehicles {
    public void vehicleFunction() {
        System.out.println("Used for personal transportation");
    }

    public void carModel() {
        System.out.println("The Model of the Car");
    }

    public void carEngine() {
        System.out.println("The Engine Type of the Car");
    }

    public void carTransmission() {
        System.out.println("The Transmission Type of the Car");
    }

    public void carColor() {
        System.out.println("The Color of the Car");
    }

    public void carPrice() {
        System.out.println("The Price of the Car");
    }
}
