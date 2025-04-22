package com.xworkz.encapsulation.bigbasket;

public class BigBasketRunner {

    public static void main(String[] args) {

        BigBasketUserDto basketDto = new BigBasketUserDto();
        basketDto.setCustomerName("Karthik Rao");
        basketDto.setDeliveryLocation("Koramangala, Bangalore");
        basketDto.setPhoneNumber("9876543210");
        basketDto.setEmail("karthik.rao@bb.com");
        basketDto.setPreferredPayment("UPI");

        System.out.println(basketDto);

    }
}
