package com.xworkz.spotifyapp.details;


import com.xworkz.spotifyapp.spotifydto.SpotifyUserDto;

public class Spotify {

    SpotifyUserDto spotifyDto;

    public void userSignUp(SpotifyUserDto spotifyDto){
        boolean isSignUpValid = false;

        boolean userValid = validateSignUp(spotifyDto);
        if (userValid == true){
            isSignUpValid = true;
            this.spotifyDto = spotifyDto;
            System.out.println("User sign up successfull!!!");
        }else{
            System.out.println("User details invalid....");
        }

    }

    public boolean validateSignUp(SpotifyUserDto spotifyDto){

        boolean isValid = false;
        boolean userIdValid = false;
        boolean userNameValid = false;
        boolean emailIdValid = false;
        boolean phoneNoValid = false;
        boolean dobValid = false;
        boolean genderValid = false;

        if (spotifyDto.getUserId() != 0){
            userIdValid = true;
        }else{
            System.out.println("Invalid user id!!!!");
        }
        if (spotifyDto.getUserName() != null){
            userNameValid = true;
        }else{
            System.out.println("Invalid user name!!!!");
        }
        if (spotifyDto.getEmailId() != null){
            emailIdValid = true;
        }else{
            System.out.println("Invalid email id!!!!");
        }
        if (spotifyDto.getPhoneNo() != null){
            phoneNoValid = true;
        }else{
            System.out.println("Invalid user phone number!!!!");
        }
        if (spotifyDto.getDob() != null){
            dobValid = true;
        }else{
            System.out.println("Invalid user dob!!!!");
        }
        if (spotifyDto.getGender() != null){
            genderValid = true;
        }else{
            System.out.println("Invalid gender!!!!");
        }
        if(userIdValid == true && userNameValid == true && emailIdValid == true && phoneNoValid == true && dobValid == true && genderValid == true){
            isValid = true;
        }
        return isValid;

    }
    public void getSpotifyUserDetails() {
        System.out.println("----------------------------------");
        System.out.println("UserId :" + this.spotifyDto.getUserId());
        System.out.println("User Name:" + this.spotifyDto.getUserName());
        System.out.println("EmailId :" + this.spotifyDto.getEmailId());
        System.out.println("phone number :" + this.spotifyDto.getPhoneNo());
        System.out.println("Date Of Birth :" + this.spotifyDto.getDob());
        System.out.println("Gender :" + this.spotifyDto.getGender());
        System.out.println("----------------------------------");
    }
}
