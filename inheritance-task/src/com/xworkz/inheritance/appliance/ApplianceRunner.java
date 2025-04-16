package com.xworkz.inheritance.appliance;

import com.xworkz.inheritance.appliance.appfunction.Appliance;
import com.xworkz.inheritance.appliance.microwave.Microwave;

public class ApplianceRunner {

    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.applianceBrand();
        appliance.applianceModel();
        appliance.applianceName();
        appliance.appliancePower();
        appliance.applianceType();

        Appliance appliance1 = new Microwave();
        appliance1.applianceBrand();
        appliance1.applianceModel();
        appliance1.applianceName();
        appliance1.appliancePower();
        appliance1.applianceType();

        Microwave microwave = new Microwave();
        microwave.microwaveBrand();
        microwave.microwaveCapacity();
        microwave.microwaveModel();
        microwave.microwavePower();
        microwave.microwaveType();
    }
}
