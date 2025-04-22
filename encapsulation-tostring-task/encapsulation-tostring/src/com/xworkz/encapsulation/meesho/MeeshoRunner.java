package com.xworkz.encapsulation.meesho;

public class MeeshoRunner {

    public static void main(String[] args) {

        MeeshoCustomerDto meeshoDto = new MeeshoCustomerDto();
        meeshoDto.setUserName("Nisha Patel");
        meeshoDto.setPhoneNumber("9901234567");
        meeshoDto.setEmail("nisha.patel@meesho.com");
        meeshoDto.setDeliveryAddress("Whitefield, Bangalore");
        meeshoDto.setPreferredPaymentMethod("Credit Card");
        meeshoDto.setOrderHistory("Shirt, Shoes, Watch");

        System.out.println(meeshoDto);
    }
}
