package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazondto.AmazonCustomerDto;
import com.xworkz.amazonapp.constants.PaymentMethod;

import com.xworkz.amazonapp.generateamazon.Amazon;

public class AmazonRunner {

    public static void main(String[] args) {


        AmazonCustomerDto dto = new AmazonCustomerDto();
        dto.setCustomerName("Akhil Raj");
        dto.setEmail("akhilraj@gmail.com");
        dto.setAddress("1st Cross, Indiranagar, Bangalore");
        dto.setContactNumber("9876543210");
        dto.setProductName("Wireless Mouse");
        dto.setQuantity(2);
        dto.setPrice(799.99);
        dto.setPaymentMethod(PaymentMethod.CREDIT_CARD);



        Amazon amazon = new Amazon();
        amazon.placeOrder(dto);
        amazon.getAmazonCustomerDetails();
    }
}
