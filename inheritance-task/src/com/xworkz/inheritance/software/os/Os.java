package com.xworkz.inheritance.software.os;

import com.xworkz.inheritance.software.softwareDetails.Software;

public class Os extends Software {


    public void osVersion() {
        System.out.println("Current OS Version");
    }

    public void osPlatform() {
        System.out.println("The Platform (e.g., Windows, Linux, MacOS)");
    }

    public void osKernel() {
        System.out.println("The OS Kernel Type");
    }

    public void osArchitecture() {
        System.out.println("The OS Architecture (e.g., 32-bit, 64-bit)");
    }

    public void osSecurityFeatures() {
        System.out.println("Security Features of the OS");
    }
}

