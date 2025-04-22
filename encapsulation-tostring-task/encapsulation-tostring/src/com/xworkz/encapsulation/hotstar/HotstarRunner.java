package com.xworkz.encapsulation.hotstar;

public class HotstarRunner {

    public static void main(String[] args) {

        HotstarUserDto hotstarDto = new HotstarUserDto();
        hotstarDto.setSubscriberName("Aman Verma");
        hotstarDto.setEmail("aman.verma@hotstar.com");
        hotstarDto.setMobileNumber("9988776655");
        hotstarDto.setSubscriptionType("Premium");
        hotstarDto.setRegion("North India");

        System.out.println(hotstarDto);
    }
}
