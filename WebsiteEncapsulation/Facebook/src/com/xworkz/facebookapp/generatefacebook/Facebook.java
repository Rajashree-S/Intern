package com.xworkz.facebookapp.generatefacebook;

import com.xworkz.facebookapp.constants.Gender;
import com.xworkz.facebookapp.facebookdto.FacebookUserDto;


public class Facebook {

    FacebookUserDto facebookDto;

    public boolean newAccount(FacebookUserDto facebookDto){

        boolean isUserRegistered =false;
        boolean userValidated = validateAccount(facebookDto);
        if (userValidated == true){
            isUserRegistered = true;
            this.facebookDto = facebookDto;
        }else{
            System.out.println("User details invalid....");
        }
        return isUserRegistered;
    }
    public boolean validateAccount(FacebookUserDto facebookDto) {

        boolean userValidated = false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean userNameValid = false;

        if (facebookDto.getFirstName() != null && !facebookDto.getFirstName().isEmpty()) {
            firstNameValid = true;
        } else {
            System.out.println("Invalid First Name!!!!");
        }

        if (facebookDto.getLastName() != null && !facebookDto.getLastName().isEmpty()) {
            lastNameValid = true;
        } else {
            System.out.println("Invalid Last Name!!!!");
        }

        if (facebookDto.getDob() != null && !facebookDto.getDob().isEmpty()) {
            dobValid = true;
        } else {
            System.out.println("Invalid Date of Birth!!!!");
        }

        if (facebookDto.getGender() != null) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!!!!");
        }

        if (facebookDto.getEmail() != null && !facebookDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (facebookDto.getMobile() != null && !facebookDto.getMobile().isEmpty()) {
            mobileValid = true;
        } else {
            System.out.println("Invalid Mobile Number!!!!");
        }

        if (facebookDto.getPassword() != null && !facebookDto.getPassword().isEmpty()) {
            passwordValid = true;
        } else {
            System.out.println("Invalid Password!!!!");
        }

        if (facebookDto.getUserName() != null && !facebookDto.getUserName().isEmpty()) {
            userNameValid = true;
        } else {
            System.out.println("Invalid Username!!!!");
        }

        if (firstNameValid == true && lastNameValid == true && dobValid == true && genderValid == true && emailValid == true &&
                mobileValid == true && passwordValid == true && userNameValid == true) {
            userValidated = true;
        }

        return userValidated;
    }

    public void getFacebookUserDetails(){
        System.out.println("----------------------------------");

        System.out.println("The First Name: " + this.facebookDto.getFirstName());
        System.out.println("The Last Name: " + this.facebookDto.getLastName());
        System.out.println("The DOB: " + this.facebookDto.getDob());
        System.out.println("The Gender: " + this.facebookDto.getGender());
        System.out.println("The Email: " + this.facebookDto.getEmail());
        System.out.println("The Mobile: " + this.facebookDto.getMobile());
        System.out.println("The Username: " + this.facebookDto.getUserName());
        System.out.println("The Password: " + this.facebookDto.getPassword());

        System.out.println("----------------------------------");
    }
}
