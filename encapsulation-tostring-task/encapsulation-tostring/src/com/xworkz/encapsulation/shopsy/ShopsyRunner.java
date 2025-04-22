package com.xworkz.encapsulation.shopsy;

public class ShopsyRunner {

    public static void main(String[] args) {

        ShopsyCustomerDto shopsyDto = new ShopsyCustomerDto();
        shopsyDto.setUserName("Vijay Singh");
        shopsyDto.setEmail("vijay.singh@shopsy.com");
        shopsyDto.setPhoneNumber("9988776655");
        shopsyDto.setPreferredCategory("Electronics");
        shopsyDto.setShippingAddress("Whitefield, Bangalore");

        System.out.println(shopsyDto);
    }
}
