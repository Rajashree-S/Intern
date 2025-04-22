package com.xworkz.encapsulation.ola;

public class OlaRunner {

    public static void main(String[] args) {

        OlaUserDto olaDto = new OlaUserDto();
        olaDto.setUserName("Ravi Kumar");
        olaDto.setPhoneNumber("9876543210");
        olaDto.setEmail("ravi.kumar@ola.com");
        olaDto.setPickupLocation("Indiranagar, Bangalore");
        olaDto.setDropLocation("MG Road, Bangalore");

        System.out.println(olaDto);
    }
}
