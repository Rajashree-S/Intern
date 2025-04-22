package com.xworkz.encapsulation.tinder;

public class TinderRunner {

    public static void main(String[] args) {

        TinderUserDto tinderDto = new TinderUserDto();
        tinderDto.setName("Priya Sharma");
        tinderDto.setBirthDate("12/11/1995");
        tinderDto.setGender("Female");
        tinderDto.setEmail("priyasharma@gmail.com");
        tinderDto.setPhoneNumber("9876543210");
        tinderDto.setUserName("priya_love");
        tinderDto.setPassword("tinder@123");
        System.out.println(tinderDto);


    }
}
