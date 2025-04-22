package com.xworkz.encapsulation.nykaa;

public class NykaaRunner {

    public static void main(String[] args) {

        NykaaUserDto nykaaDto = new NykaaUserDto();
        nykaaDto.setUserName("Rina Sharma");
        nykaaDto.setEmail("rina.sharma@nykaa.com");
        nykaaDto.setPhoneNumber("8889997777");
        nykaaDto.setPreferredBrand("L'Oréal");
        nykaaDto.setShippingAddress("Banjara Hills, Hyderabad");

        System.out.println(nykaaDto);
    }
}
