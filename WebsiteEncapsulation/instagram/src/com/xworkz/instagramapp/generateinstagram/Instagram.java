package com.xworkz.instagramapp.generateinstagram;

import com.xworkz.instagramapp.instagramdto.InstagramUserDto;

public class Instagram {
        InstagramUserDto instagramDto;
        public boolean newAccount(InstagramUserDto instagramDto) {
            boolean isUserRegistered = false;
            boolean userValidated = validateAccount(instagramDto);
            if (userValidated) {
                isUserRegistered = true;
                 this.instagramDto = instagramDto;
            } else {
                System.out.println("User details invalid....");
            }
            return isUserRegistered;
        }

        public boolean validateAccount(InstagramUserDto instagramDto) {

            boolean userValidated = false;
            boolean firstNameValid = false;
            boolean lastNameValid = false;
            boolean dobValid = false;
            boolean genderValid = false;
            boolean emailValid = false;
            boolean mobileValid = false;
            boolean passwordValid = false;
            boolean userNameValid = false;

            if (instagramDto.getFirstName() != null && !instagramDto.getFirstName().isEmpty()) {
                firstNameValid = true;
            } else {
                System.out.println("Invalid First Name!!!!");
            }

            if (instagramDto.getLastName() != null && !instagramDto.getLastName().isEmpty()) {
                lastNameValid = true;
            } else {
                System.out.println("Invalid Last Name!!!!");
            }

            if (instagramDto.getDob() != null && !instagramDto.getDob().isEmpty()) {
                dobValid = true;
            } else {
                System.out.println("Invalid Date of Birth!!!!");
            }

            if (instagramDto.getGender() != null) {
                genderValid = true;
            } else {
                System.out.println("Invalid Gender!!!!");
            }

            if (instagramDto.getEmail() != null && !instagramDto.getEmail().isEmpty()) {
                emailValid = true;
            } else {
                System.out.println("Invalid Email!!!!");
            }

            if (instagramDto.getMobile() != null && !instagramDto.getMobile().isEmpty()) {
                mobileValid = true;
            } else {
                System.out.println("Invalid Mobile Number!!!!");
            }

            if (instagramDto.getPassword() != null && !instagramDto.getPassword().isEmpty()) {
                passwordValid = true;
            } else {
                System.out.println("Invalid Password!!!!");
            }

            if (instagramDto.getUserName() != null && !instagramDto.getUserName().isEmpty()) {
                userNameValid = true;
            } else {
                System.out.println("Invalid Username!!!!");
            }

            if (firstNameValid && lastNameValid && dobValid && genderValid && emailValid &&
                    mobileValid && passwordValid && userNameValid) {
                userValidated = true;
            }

            return userValidated;
        }
        public void getInstagramUserDetails(){
            System.out.println("----------------------------------");

            System.out.println("The First Name: " + this.instagramDto.getFirstName());
            System.out.println("The Last Name: " + this.instagramDto.getLastName());
            System.out.println("The DOB: " + this.instagramDto.getDob());
            System.out.println("The Gender: " + this.instagramDto.getGender());
            System.out.println("The Email: " + this.instagramDto.getEmail());
            System.out.println("The Mobile: " + this.instagramDto.getMobile());
            System.out.println("The Username: " + this.instagramDto.getUserName());
            System.out.println("The Password: " + this.instagramDto.getPassword());

            System.out.println("----------------------------------");

        }
    }




