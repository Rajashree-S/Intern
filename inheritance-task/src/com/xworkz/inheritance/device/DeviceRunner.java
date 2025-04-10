package com.xworkz.inheritance.device;

public class DeviceRunner {
    public static void main(String[] args) {
        Device base = new Device();
        base.name = "Device Example";
        base.type = "General";
        base.display();
        base.get();

        Mobile sub = new Mobile();
        sub.name = "Mobile Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
