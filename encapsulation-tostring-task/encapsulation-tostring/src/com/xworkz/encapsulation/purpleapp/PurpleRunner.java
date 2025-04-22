package com.xworkz.encapsulation.purpleapp;

public class PurpleRunner {

    public static void main(String[] args) {

        PurpleUserDto purpleDto = new PurpleUserDto();
        purpleDto.setUserName("Neha Verma");
        purpleDto.setEmail("neha.verma@purple.com");
        purpleDto.setPhoneNumber("9776543210");
        purpleDto.setPreferredBrand("Maybelline");
        purpleDto.setShippingAddress("Wakad, Pune");

        System.out.println(purpleDto);
    }
}
