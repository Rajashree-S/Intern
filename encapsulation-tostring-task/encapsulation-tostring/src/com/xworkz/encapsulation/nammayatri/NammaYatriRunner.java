package com.xworkz.encapsulation.nammayatri;

public class NammaYatriRunner {

    public static void main(String[] args) {

        NammaYatriUserDto nammaYatriDto = new NammaYatriUserDto();
        nammaYatriDto.setUserName("Suresh Kumar");
        nammaYatriDto.setPhoneNumber("8899776655");
        nammaYatriDto.setEmail("suresh.kumar@nammayatri.com");
        nammaYatriDto.setPickupLocation("Koramangala, Bangalore");
        nammaYatriDto.setDropLocation("MG Road, Bangalore");

        System.out.println(nammaYatriDto);
    }
}
