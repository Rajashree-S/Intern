package com.xworkz.encapsulation.ajio;

public class AjioRunner {

    public static void main(String[] args) {

        AjioUserDto ajioDto = new AjioUserDto();
        ajioDto.setCustomerName("Rohit Verma");
        ajioDto.setDeliveryAddress("MG Road, Bengaluru");
        ajioDto.setContactNumber("9988776655");
        ajioDto.setEmail("rohit.verma@ajio.com");
        ajioDto.setPaymentMethod("Cash on Delivery");

        System.out.println(ajioDto);

        Ajio ajio = new Ajio();
        ajio.placeOrder(ajioDto);
    }
}
