package com.xworkz.encapsulation.zepto;

public class ZeptoRunner {

    public static void main(String[] args) {

        ZeptoUserDto zeptoDto = new ZeptoUserDto();
        zeptoDto.setUserName("Nina Patel");
        zeptoDto.setEmail("nina.patel@zepto.com");
        zeptoDto.setPhoneNumber("7778889999");
        zeptoDto.setPreferredDeliveryTime("Afternoon");
        zeptoDto.setDeliveryAddress("JP Nagar, Bangalore");

        System.out.println(zeptoDto);
    }
}
