package com.xworkz.inheritance.building;

import com.xworkz.inheritance.building.apartment.Apartment;
import com.xworkz.inheritance.building.buildingdetails.Building;

public class BuildingRunner {

    public static void main(String[] args) {

        Building building = new Building();
        building.buildingAddress();
        building.buildingHeight();
        building.buildingName();
        building.buildingType();
        building.buildingYearBuilt();

        Building building1 = new Apartment();
        building1.buildingAddress();
        building1.buildingHeight();
        building1.buildingName();
        building1.buildingType();
        building1.buildingYearBuilt();

        Apartment apartment =  new Apartment();
        apartment.apartmentArea();
        apartment.apartmentFloor();
        apartment.apartmentOwner();
        apartment.apartmentNumber();
        apartment.apartmentType();
    }
}
