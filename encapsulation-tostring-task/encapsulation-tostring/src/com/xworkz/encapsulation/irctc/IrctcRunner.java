package com.xworkz.encapsulation.irctc;

public class IrctcRunner {

    public static void main(String[] args) {

        IrctcUserDto irctcDto = new IrctcUserDto();
        irctcDto.setPassengerName("Rohit Shetty");
        irctcDto.setEmail("rohit.shetty@irctc.com");
        irctcDto.setPhoneNumber("9012345678");
        irctcDto.setTravelClass("Sleeper");
        irctcDto.setDestination("Delhi");

        System.out.println(irctcDto);
    }
}
