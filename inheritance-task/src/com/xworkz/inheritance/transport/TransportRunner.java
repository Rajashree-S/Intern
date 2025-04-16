package com.xworkz.inheritance.transport;

import com.xworkz.inheritance.transport.train.Train;
import com.xworkz.inheritance.transport.transportdetails.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.transportType();
        transport.transportMode();
        transport.transportCapacity();
        transport.transportSpeed();
        transport.transportFuelType();

        Transport transport1 = new Train();
        transport1.transportType();
        transport1.transportMode();
        transport1.transportCapacity();
        transport1.transportSpeed();

        Train train = new Train();
        train.trainType();
        train.trainTrackType();
        train.trainLength();
        train.trainSpeed();
        train.trainOperator();
    }
}
