package com.xworkz.inheritance.vehicle;

import com.xworkz.inheritance.vehicle.car.Car;
import com.xworkz.inheritance.vehicle.vehicledetails.Vehicles;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles();
        vehicle.vehicleType();
        vehicle.vehicleBrand();
        vehicle.vehicleFuelType();
        vehicle.vehicleCapacity();
        vehicle.vehicleSpeed();

        Vehicles vehicle1 = new Car();
        vehicle1.vehicleFunction();
        vehicle1.vehicleType();
        vehicle1.vehicleBrand();
        vehicle1.vehicleFuelType();
        vehicle1.vehicleCapacity();

        Car car = new Car();
        car.carModel();
        car.carEngine();
        car.carTransmission();
        car.carColor();
        car.carPrice();
    }
}
