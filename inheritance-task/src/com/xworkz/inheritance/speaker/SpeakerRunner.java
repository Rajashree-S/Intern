package com.xworkz.inheritance.speaker;

import com.xworkz.inheritance.electronic.electronicdevice.Electronic;

public class SpeakerRunner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.deviceName();
        device.deviceType();
        device.deviceManufacturer();
        device.devicePowerConsumption();
        device.devicePrice();

        ElectronicDevice device1 = new Speaker();
        device1.deviceName();
        device1.deviceType();
        device1.deviceManufacturer();
        device1.devicePowerConsumption();

        Speaker speaker = new Speaker();
        speaker.speakerType();
        speaker.speakerSoundQuality();
        speaker.speakerConnectivity();
        speaker.speakerVolume();
        speaker.speakerSize();
    }
}
