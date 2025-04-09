package com.xworkz.facebookapp;

import com.xworkz.facebookapp.constants.Gender;

import com.xworkz.facebookapp.facebookdto.FacebookUserDto;
import com.xworkz.facebookapp.generatefacebook.Facebook;

public class FacebookRunner {

    public static void main(String[] args) {


        FacebookUserDto facebookDto = new FacebookUserDto();
        facebookDto.setFirstName("Menaka");
        facebookDto.setLastName("Pooja");
        facebookDto.setDob("12/04/2006");
        facebookDto.setGender(Gender.Female);
        facebookDto.setEmail("menakapooja@gmail.com");
        facebookDto.setMobile("9876543210");
        facebookDto.setUserName("menaka");
        facebookDto.setPassword("menaka@123");




        Facebook facebook = new Facebook();
        facebook.newAccount(facebookDto);
        facebook.getFacebookUserDetails();
    }
}
