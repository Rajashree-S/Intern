package com.xworkz.snapchatapp;

import com.xworkz.snapchatapp.constants.Gender;
import com.xworkz.snapchatapp.snapchatdto.SnapchatUserDto;
import com.xworkz.snapchatapp.generatesnapchat.Snapchat;

public class SnapchatRunner {

    public static void main(String[] args) {



        SnapchatUserDto snapchatDto = new SnapchatUserDto();
        snapchatDto.setFirstName("Divya");
        snapchatDto.setLastName("Shetty");
        snapchatDto.setDob("15/08/1998");
        snapchatDto.setGender(Gender.female);
        snapchatDto.setEmail("divya.shetty@snapchat.com");
        snapchatDto.setMobile("9876543210");
        snapchatDto.setUserName("divya_snap");
        snapchatDto.setPassword("snap@divya");
        System.out.println(snapchatDto);


        Snapchat snapchat = new Snapchat();
        snapchat.newAccount(snapchatDto);
        snapchat.displaySnapchatUserDetails();
    }
}
