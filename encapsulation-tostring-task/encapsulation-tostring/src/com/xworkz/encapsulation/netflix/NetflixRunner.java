package com.xworkz.encapsulation.netflix;

public class NetflixRunner {

    public static void main(String[] args) {

        NetflixUserDto netflixDto = new NetflixUserDto();
        netflixDto.setUserName("Anjali Gupta");
        netflixDto.setEmail("anjali.gupta@netflix.com");
        netflixDto.setPhoneNumber("9998776655");
        netflixDto.setSubscriptionPlan("Premium");
        netflixDto.setRegion("India");

        System.out.println(netflixDto);
    }
}
