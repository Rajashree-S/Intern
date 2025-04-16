package com.xworkz.inheritance.transport.train;

import com.xworkz.inheritance.transport.transportdetails.Transport;

public class Train extends Transport {
    public void transportFunction() {
        System.out.println("Carries passengers or goods via railway");
    }

    public void trainType() {
        System.out.println("Type of Train (Passenger, Freight, Metro)");
    }

    public void trainTrackType() {
        System.out.println("Type of Track (Electric, Diesel, Magnetic)");
    }

    public void trainLength() {
        System.out.println("Number of coaches or length of the train");
    }

    public void trainSpeed() {
        System.out.println("Maximum Speed of the Train");
    }

    public void trainOperator() {
        System.out.println("Operator or Company Running the Train");
    }
}

