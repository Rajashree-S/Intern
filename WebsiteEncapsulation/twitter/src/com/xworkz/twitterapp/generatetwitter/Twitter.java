// File: com/xworkz/twitterapp/generatetwitter/Twitter.java
package com.xworkz.twitterapp.generatetwitter;

import com.xworkz.twitterapp.twitterdto.TwitterUserDto;

public class Twitter {

    TwitterUserDto twitterDto;
    public boolean newAccount(TwitterUserDto twitterDto) {
        boolean isUserRegistered = false;
        boolean userValidated = validateAccount(twitterDto);
        if (userValidated) {
            isUserRegistered = true;
            this.twitterDto = twitterDto;
        } else {
            System.out.println("User details invalid....");
        }
        return isUserRegistered;
    }

    public boolean validateAccount(TwitterUserDto twitterDto) {

        boolean userValidated = false;
        boolean fullNameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean passwordValid = false;
        boolean userNameValid = false;

        if (twitterDto.getFullName() != null && !twitterDto.getFullName().isEmpty()) {
            fullNameValid = true;
        } else {
            System.out.println("Invalid Full Name!!!!");
        }

        if (twitterDto.getDob() != null && !twitterDto.getDob().isEmpty()) {
            dobValid = true;
        } else {
            System.out.println("Invalid Date of Birth!!!!");
        }

        if (twitterDto.getGender() != null) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!!!!");
        }

        if (twitterDto.getEmail() != null && !twitterDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (twitterDto.getMobile() != null && !twitterDto.getMobile().isEmpty()) {
            mobileValid = true;
        } else {
            System.out.println("Invalid Mobile Number!!!!");
        }

        if (twitterDto.getPassword() != null && !twitterDto.getPassword().isEmpty()) {
            passwordValid = true;
        } else {
            System.out.println("Invalid Password!!!!");
        }

        if (twitterDto.getUserName() != null && !twitterDto.getUserName().isEmpty()) {
            userNameValid = true;
        } else {
            System.out.println("Invalid Username!!!!");
        }

        if (fullNameValid && dobValid && genderValid && emailValid &&
                mobileValid && passwordValid && userNameValid) {
            userValidated = true;
        }

        return userValidated;
    }
    public void getTwitterUserDetails(){
        System.out.println("----------------------------------");
        System.out.println("The Full Name: " + this.twitterDto.getFullName());
        System.out.println("The DOB: " + this.twitterDto.getDob());
        System.out.println("The Gender: " + this.twitterDto.getGender());
        System.out.println("The Email: " + this.twitterDto.getEmail());
        System.out.println("The Mobile: " + this.twitterDto.getMobile());
        System.out.println("The Username: " + this.twitterDto.getUserName());
        System.out.println("The Password: " + this.twitterDto.getPassword());

        System.out.println("----------------------------------");
    }
}
