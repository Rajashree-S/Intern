package com.xworkz.encapsulation.blinkit;

public class BlinkitRunner {


    public static void main(String[] args) {

        BlinkitCustomerDto blinkitDto = new BlinkitCustomerDto();
        blinkitDto.setUserName("Ananya Singh");
        blinkitDto.setDeliveryAddress("Indiranagar, Bangalore");
        blinkitDto.setContactNumber("9123456780");
        blinkitDto.setPaymentMode("Cash on Delivery");

        System.out.println(blinkitDto);
    }
}
