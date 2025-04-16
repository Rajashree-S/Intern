package com.xworkz.inheritance.remote;

public class RemoteRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.plasticType();
        plastic.plasticOrigin();
        plastic.plasticUse();
        plastic.plasticRecyclable();
        plastic.plasticDurability();

        Plastic plastic1 = new Remote();
        plastic1.plasticFunction();
        plastic1.plasticType();
        plastic1.plasticOrigin();
        plastic1.plasticUse();
        plastic1.plasticRecyclable();

        Remote remote = new Remote();
        remote.remoteType();
        remote.remoteBrand();
        remote.remoteBattery();
        remote.remoteRange();
        remote.remoteButtons();

    }
}
