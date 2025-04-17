package com.xworkz.typesofinheritance.singleinheritance;

public class AirportRunner{
    public static void main(String[] args) {

        System.out.println("-----Airport Details-----");
        Airport airport = new Airport();
        airport.airportName();
        airport.location();
        airport.terminalCount();
        airport.runwayLength();
        airport.openedYear();
        airport.airportCode();
        airport.totalFlightsDaily();
        airport.cargoFacility();


        System.out.println("-----International Airport Details-----");
        InternationalAirport international = new InternationalAirport();
        international.immigrationCheck();
        international.dutyFreeShops();
        international.internationalFlights();
        international.vipLounge();
        international.foreignExchange();
        international.multilingualSupport();
        international.securityLevel();
        international.globalAirlines();
    }

}

