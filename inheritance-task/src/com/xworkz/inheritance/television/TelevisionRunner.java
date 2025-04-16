package com.xworkz.inheritance.television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.applianceBrand();
        appliance.applianceModel();
        appliance.applianceName();
        appliance.appliancePower();
        appliance.applianceType();

        Appliance appliance1 = new Television();
        appliance1.applianceBrand();
        appliance1.applianceModel();
        appliance1.applianceName();
        appliance1.appliancePower();
        appliance1.applianceType();

        Television television = new Television();
        television.televisionBrand();
        television.televisionPorts();
        television.televisionResolution();
        television.televisionSize();
        television.televisionSmartFeatures();

    }
}
