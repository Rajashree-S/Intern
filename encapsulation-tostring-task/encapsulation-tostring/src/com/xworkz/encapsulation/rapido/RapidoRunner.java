package com.xworkz.encapsulation.rapido;

public class RapidoRunner {

    public static void main(String[] args) {

        RapidoUserDto rapidoDto = new RapidoUserDto();
        rapidoDto.setUserName("Amit Sharma");
        rapidoDto.setPhoneNumber("9888776655");
        rapidoDto.setEmail("amit.sharma@rapido.com");
        rapidoDto.setPickupLocation("MG Road, Bangalore");
        rapidoDto.setDropLocation("Whitefield, Bangalore");

        System.out.println(rapidoDto);
    }
}
