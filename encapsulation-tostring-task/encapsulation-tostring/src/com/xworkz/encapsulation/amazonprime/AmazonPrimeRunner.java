package com.xworkz.encapsulation.amazonprime;

public class AmazonPrimeRunner {
    public static void main(String[] args) {

        AmazonPrimeUserDto primeDto = new AmazonPrimeUserDto();
        primeDto.setSubscriberName("Sneha Mehta");
        primeDto.setEmail("sneha.mehta@prime.com");
        primeDto.setContactNumber("9123456789");
        primeDto.setSubscriptionType("Annual");
        primeDto.setPaymentStatus("Paid");

        System.out.println(primeDto);

        AmazonPrime prime = new AmazonPrime();
        prime.activateSubscription(primeDto);
    }
}
