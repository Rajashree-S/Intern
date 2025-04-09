package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.constants.Gender;
import com.xworkz.spotifyapp.details.Spotify;
import com.xworkz.spotifyapp.spotifydto.SpotifyUserDto;

public class SpotifyRunner {
    public static void main(String[] args) {

        SpotifyUserDto spotifyDto = new SpotifyUserDto();
        spotifyDto.setUserId(12);
        spotifyDto.setUserName("Ria");
        spotifyDto.setEmailId("ria@gmail.com");
        spotifyDto.setPhoneNo("9988007765");
        spotifyDto.setDob("12/3/2002");
        spotifyDto.setGender(Gender.female);



        Spotify spotify = new Spotify();
        spotify.userSignUp(spotifyDto);
        spotify.getSpotifyUserDetails();
    }
}
