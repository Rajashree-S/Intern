package com.xworkz.encapsulation.amazonprime;

public class AmazonPrime {

    AmazonPrimeUserDto primeDto;

    public boolean activateSubscription(AmazonPrimeUserDto primeDto) {
        boolean isActivated = false;
        boolean validated = validateDetails(primeDto);

        if (validated) {
            isActivated = true;
            this.primeDto = primeDto;
        } else {
            System.out.println("Subscription details are invalid....");
        }

        return isActivated;
    }

    public boolean validateDetails(AmazonPrimeUserDto primeDto) {
        boolean isValid = false;

        boolean nameValid = false;
        boolean emailValid = false;
        boolean contactValid = false;
        boolean subscriptionValid = false;
        boolean paymentValid = false;

        if (primeDto.getSubscriberName() != null && !primeDto.getSubscriberName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Subscriber Name!!!!");
        }

        if (primeDto.getEmail() != null && !primeDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (primeDto.getContactNumber() != null && !primeDto.getContactNumber().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("Invalid Contact Number!!!!");
        }

        if (primeDto.getSubscriptionType() != null && !primeDto.getSubscriptionType().isEmpty()) {
            subscriptionValid = true;
        } else {
            System.out.println("Invalid Subscription Type!!!!");
        }

        if (primeDto.getPaymentStatus() != null && !primeDto.getPaymentStatus().isEmpty()) {
            paymentValid = true;
        } else {
            System.out.println("Invalid Payment Status!!!!");
        }

        if (nameValid && emailValid && contactValid && subscriptionValid && paymentValid) {
            isValid = true;
        }

        return isValid;
    }
}
