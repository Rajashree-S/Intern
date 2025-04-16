package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.constants.PaymentMethod;

import com.xworkz.flipkartapp.flipkartdto.FlipkartCustomerDto;
import com.xworkz.flipkartapp.generateflipkart.Flipkart;

public class FlipkartRunner {

    public static void main(String[] args) {


        FlipkartCustomerDto dto = new FlipkartCustomerDto();
        dto.setCustomerName("Akhil Raj");
        dto.setEmail("akhilraj@gmail.com");
        dto.setAddress("5th Block, Jayanagar, Bangalore");
        dto.setContactNumber("9876543210");
        dto.setProductName("Bluetooth Speaker");
        dto.setQuantity(1);
        dto.setPrice(1499.50);
        dto.setPaymentMethod(PaymentMethod.UPI);


        Flipkart flipkart = new Flipkart();
        flipkart.placeOrder(dto);
        flipkart.getFlipkartCustomerDetails();
    }
}
