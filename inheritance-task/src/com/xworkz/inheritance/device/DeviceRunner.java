package com.xworkz.inheritance.device;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.deviceBrand();
        device.deviceModel();
        device.deviceName();
        device.deviceType();
        device.devicePowerStatus();

        Device device1 = new Mobile();
        device1.deviceBrand();
        device1.deviceModel();
        device1.deviceName();
        device1.deviceType();
        device1.devicePowerStatus();

        Mobile mobile = new Mobile();
        mobile.mobileBrand();
        mobile.mobileModel();
        mobile.mobileStorage();
        mobile.mobileOS();
        mobile.mobileCameraSpecs();




    }
}
