package com.xworkz.encapsulation.ajio;

public class Ajio {

    AjioUserDto ajioDto;

    public boolean placeOrder(AjioUserDto ajioDto) {
        boolean isPlaced = false;
        boolean validated = validateOrder(ajioDto);

        if (validated) {
            isPlaced = true;
            this.ajioDto = ajioDto;
        } else {
            System.out.println("Order details are invalid....");
        }

        return isPlaced;
    }

    public boolean validateOrder(AjioUserDto ajioDto) {
        boolean isValid = false;

        boolean nameValid = false;
        boolean addressValid = false;
        boolean contactValid = false;
        boolean emailValid = false;
        boolean paymentValid = false;

        if (ajioDto.getCustomerName() != null && !ajioDto.getCustomerName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Customer Name!!!!");
        }

        if (ajioDto.getDeliveryAddress() != null && !ajioDto.getDeliveryAddress().isEmpty()) {
            addressValid = true;
        } else {
            System.out.println("Invalid Delivery Address!!!!");
        }

        if (ajioDto.getContactNumber() != null && !ajioDto.getContactNumber().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("Invalid Contact Number!!!!");
        }

        if (ajioDto.getEmail() != null && !ajioDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (ajioDto.getPaymentMethod() != null && !ajioDto.getPaymentMethod().isEmpty()) {
            paymentValid = true;
        } else {
            System.out.println("Invalid Payment Method!!!!");
        }

        if (nameValid && addressValid && contactValid && emailValid && paymentValid) {
            isValid = true;
        }

        return isValid;
    }
}
