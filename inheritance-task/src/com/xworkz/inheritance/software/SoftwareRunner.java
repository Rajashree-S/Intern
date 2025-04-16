package com.xworkz.inheritance.software;

import com.xworkz.inheritance.software.os.Os;
import com.xworkz.inheritance.software.softwareDetails.Software;

public class SoftwareRunner {
    public static void main(String[] args) {
        Software software = new Software();
        software.softwareName();
        software.softwareType();
        software.softwareDeveloper();
        software.softwareReleaseYear();
        software.softwarePurpose();

        Software software1 = new Os();
        software1.softwareFunction();
        software1.softwareName();
        software1.softwareType();
        software1.softwareDeveloper();
        software1.softwareReleaseYear();

        Os os = new Os();
        os.osVersion();
        os.osPlatform();
        os.osKernel();
        os.osArchitecture();
        os.osSecurityFeatures();
    }
}
