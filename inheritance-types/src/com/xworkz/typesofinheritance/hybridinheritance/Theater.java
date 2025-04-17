package com.xworkz.typesofinheritance.hybridinheritance;

public class Theater extends Movies{

    public void theaterName() {
        System.out.println("PVR Cinemas");
    }

    public void location() {
        System.out.println("Rajajinagar, Bengaluru");
    }

    public void totalScreens() {
        System.out.println("5");
    }

    public void seatingCapacity() {
        System.out.println("1200");
    }

    public void screenType() {
        System.out.println("IMAX");
    }

    public void ticketPrice() {
        System.out.println("300rs per ticket");
    }

    public void parkingAvailable() {
        System.out.println("Yes");
    }

    public void showTimings() {
        System.out.println("10:00 AM, 1:00 PM, 4:00 PM, 7:00 PM, 10:00 PM");
    }
}
