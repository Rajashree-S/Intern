package com.xworkz.inheritance.electronic;

import com.xworkz.inheritance.electronic.electronicdevice.Electronic;
import com.xworkz.inheritance.electronic.phone.Television;

public class ElectronicRunner {
    public static void main(String[] args) {
        Electronic electronic = new Electronic();
        electronic.electronicBrand();
        electronic.electronicName();
        electronic.electronicType();
        electronic.electronicWarranty();
        electronic.electronicPowerUsage();

        Electronic electronic1 = new Television();
        electronic1.electronicBrand();
        electronic1.electronicName();
        electronic1.electronicType();
        electronic1.electronicWarranty();
        electronic1.electronicPowerUsage();

        Television television = new Television();
        television.televisionBrand();
        television.televisionPorts();
        television.televisionResolution();
        television.televisionSize();
        television.televisionSmartFeatures();


    }
}
