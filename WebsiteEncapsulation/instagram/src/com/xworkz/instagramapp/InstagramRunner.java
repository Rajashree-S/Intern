package com.xworkz.instagramapp;

import com.xworkz.instagramapp.constants.Gender;

import com.xworkz.instagramapp.generateinstagram.Instagram;
import com.xworkz.instagramapp.instagramdto.InstagramUserDto;

public class InstagramRunner {

    public static void main(String[] args) {


        InstagramUserDto instagramDto = new InstagramUserDto();
        instagramDto.setFirstName("Akhil");
        instagramDto.setLastName("Raj");
        instagramDto.setDob("01/01/2000");
        instagramDto.setGender(Gender.Male);
        instagramDto.setEmail("akhilraj@gmail.com");
        instagramDto.setMobile("9876543210");
        instagramDto.setUserName("akhil_raj");
        instagramDto.setPassword("akhil@insta");



        Instagram instagram = new Instagram();
        instagram.newAccount(instagramDto);
        instagram.getInstagramUserDetails();
    }
}
