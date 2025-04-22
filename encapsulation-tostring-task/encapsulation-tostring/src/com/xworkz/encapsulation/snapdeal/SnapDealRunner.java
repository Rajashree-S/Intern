package com.xworkz.encapsulation.snapdeal;

import com.xworkz.encapsulation.shopsy.ShopsyCustomerDto;

public class SnapDealRunner {

    public static void main(String[] args) {

        SnapDealCustomerDto snapdealDto = new SnapDealCustomerDto();
        snapdealDto.setUserName("Rohit Sharma");
        snapdealDto.setPhoneNumber("9123456789");
        snapdealDto.setEmail("rohit.sharma@snapdeal.com");
        snapdealDto.setPreferredPaymentMethod("Credit Card");
        snapdealDto.setShippingAddress("Andheri West, Mumbai");

        System.out.println(snapdealDto);
    }
}
