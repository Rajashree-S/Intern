package com.xworkz.encapsulation.uber;

public class UberRunner {

    public static void main(String[] args) {

        UberUserDto uberDto = new UberUserDto();
        uberDto.setUserName("Ravi Sharma");
        uberDto.setPhoneNumber("9988776655");
        uberDto.setEmail("ravi.sharma@uber.com");
        uberDto.setPickupLocation("MG Road, Bangalore");
        uberDto.setDropLocation("Whitefield, Bangalore");

        System.out.println(uberDto);
    }
}
