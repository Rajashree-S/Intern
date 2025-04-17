package com.xworkz.typesofinheritance.multilevelinheritance;

public class VehicleRunner {
    public static void main(String[] args) {

        System.out.println("-----Vehicle Details-----");
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleType();
        vehicle.brand();
        vehicle.fuelType();
        vehicle.color();
        vehicle.capacity();
        vehicle.wheelCount();
        vehicle.registrationNumber();
        vehicle.vehicleWeight();

        System.out.println("-----Bus Details-----");
        Bus bus = new Bus();
        bus.busNumber();
        bus.routeName();
        bus.busType();
        bus.conductorName();
        bus.ticketPrice();
        bus.stopCount();
        bus.boardingTime();
        bus.reachingTime();

        System.out.println("-----Volvo Bus Details-----");
        VolvoBus volvo = new VolvoBus();
        volvo.acAvailable();
        volvo.usbCharging();
        volvo.wifiAvailable();
        volvo.reclinerSeats();
        volvo.entertainmentSystem();
        volvo.safetyFeatures();
        volvo.driverName();
        volvo.travelAgency();
    }

}
