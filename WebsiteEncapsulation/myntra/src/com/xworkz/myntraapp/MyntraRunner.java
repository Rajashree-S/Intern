package com.xworkz.myntraapp;

import com.xworkz.myntraapp.constants.PaymentMethod;
import com.xworkz.myntraapp.generatemyntra.Myntra;
import com.xworkz.myntraapp.myntradto.MyntraCustomerDto;

public class MyntraRunner {

    public static void main(String[] args) {


        MyntraCustomerDto dto = new MyntraCustomerDto();
        dto.setCustomerName("Sahana P");
        dto.setEmail("sahana.myntra@gmail.com");
        dto.setAddress("4th Main, HSR Layout, Bangalore");
        dto.setContactNumber("9876543219");
        dto.setProductName("Cotton Kurti");
        dto.setQuantity(2);
        dto.setPrice(1899.99);
        dto.setPaymentMethod(PaymentMethod.CASH_ON_DELIVERY);

        Myntra myntra = new Myntra();
        myntra.placeOrder(dto);
        myntra.displayCustomerDetails();

    }
}
