package com.xworkz.zomatoapp.service;

import com.xworkz.zomatoapp.user.ZomatoUserDto;

public class ZomatoService {

    ZomatoUserDto user;
    public boolean isRegistered(ZomatoUserDto user) {

        boolean isSignUpValid = true;
        boolean userValid = isValid(user);
        if (userValid == true){
            isSignUpValid = true;
            this.user = user;
            System.out.println("User sign up successfull!!!");
        }else{
            System.out.println("User details invalid....");
        }
        return isSignUpValid;
    }

    private boolean isValid(ZomatoUserDto user) {
        boolean isValid = true;

        if (user.getName() == null) {
            System.out.println("Name is missing");
            isValid = false;
        }
        if (user.getCity() == null) {
            System.out.println("City is missing");
            isValid = false;
        }
        if (user.getPhoneNumber() == null) {
            System.out.println("Phone number is missing");
            isValid = false;
        }
        if (user.getFavoriteCuisine() == null) {
            System.out.println("Favorite cuisine is missing");
            isValid = false;
        }

        return isValid;
    }

    public void displayZomatoUserDetails(){
        System.out.println("----------------------------------");

        System.out.println("User Name:" + this.user.getName());
        System.out.println("City :" + this.user.getCity());
        System.out.println("phone number :" + this.user.getPhoneNumber());
        System.out.println("Favourite Cusine :" + this.user.getFavoriteCuisine());

        System.out.println("----------------------------------");

    }

}
