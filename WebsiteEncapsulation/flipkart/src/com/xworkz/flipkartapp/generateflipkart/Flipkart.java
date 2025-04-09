package com.xworkz.flipkartapp.generateflipkart;

import com.xworkz.flipkartapp.flipkartdto.FlipkartCustomerDto;


public class Flipkart {

    FlipkartCustomerDto dto;
    public boolean placeOrder(FlipkartCustomerDto dto) {
        boolean orderPlaced = false;
        boolean validated = validateOrder(dto);
        if (validated) {
            orderPlaced = true;
            this.dto = dto;
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order validation failed!");
        }
        return orderPlaced;
    }

    public boolean validateOrder(FlipkartCustomerDto dto) {

        boolean orderValidated = false;

        boolean nameValid = false;
        boolean emailValid = false;
        boolean addressValid = false;
        boolean contactValid = false;
        boolean productValid = false;
        boolean quantityValid = false;
        boolean priceValid = false;
        boolean paymentValid = false;

        if (dto.getCustomerName() != null && !dto.getCustomerName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Customer Name!");
        }

        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!");
        }

        if (dto.getAddress() != null && !dto.getAddress().isEmpty()) {
            addressValid = true;
        } else {
            System.out.println("Invalid Address!");
        }

        if (dto.getContactNumber() != null && !dto.getContactNumber().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("Invalid Contact Number!");
        }

        if (dto.getProductName() != null && !dto.getProductName().isEmpty()) {
            productValid = true;
        } else {
            System.out.println("Invalid Product Name!");
        }

        if (dto.getQuantity() > 0) {
            quantityValid = true;
        } else {
            System.out.println("Invalid Quantity!");
        }

        if (dto.getPrice() > 0) {
            priceValid = true;
        } else {
            System.out.println("Invalid Price!");
        }

        if (dto.getPaymentMethod() != null) {
            paymentValid = true;
        } else {
            System.out.println("Invalid Payment Method!");
        }

        if (nameValid && emailValid && addressValid && contactValid && productValid &&
                quantityValid && priceValid && paymentValid) {
            orderValidated = true;
        }

        return orderValidated;
    }
    public void getFlipkartCustomerDetails(){
        System.out.println("----------------------------------");
        System.out.println("Customer Name: " + this.dto.getCustomerName());
        System.out.println("Email: " + this.dto.getEmail());
        System.out.println("Address: " + this.dto.getAddress());
        System.out.println("Contact Number: " + this.dto.getContactNumber());
        System.out.println("Product: " + this.dto.getProductName());
        System.out.println("Quantity: " + this.dto.getQuantity());
        System.out.println("Price: " + this.dto.getPrice());
        System.out.println("Payment Method: " + this.dto.getPaymentMethod());

        System.out.println("----------------------------------");
    }

}

