package com.xworkz.encapsulation.redbus;

public class RedBusRunner {

    public static void main(String[] args) {

        RedBusUserDto redBusDto = new RedBusUserDto();
        redBusDto.setUserName("Anita Rani");
        redBusDto.setPhoneNumber("9876543210");
        redBusDto.setEmail("anita.rani@redbus.com");
        redBusDto.setBoardingPoint("Majestic, Bangalore");
        redBusDto.setDestination("Mysore");

        System.out.println(redBusDto);
    }
}
