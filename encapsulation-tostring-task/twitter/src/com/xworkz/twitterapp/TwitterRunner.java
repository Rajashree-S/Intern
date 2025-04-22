// File: com/xworkz/twitterapp/TwitterRunner.java
package com.xworkz.twitterapp;

import com.xworkz.twitterapp.constants.Gender;
import com.xworkz.twitterapp.twitterdto.TwitterUserDto;
import com.xworkz.twitterapp.generatetwitter.Twitter;

public class TwitterRunner {

    public static void main(String[] args) {



        TwitterUserDto twitterDto = new TwitterUserDto();
        twitterDto.setFullName("Ravi Kumar");
        twitterDto.setDob("15/08/1998");
        twitterDto.setGender(Gender.Male);
        twitterDto.setEmail("ravikumar@gmail.com");
        twitterDto.setMobile("9876501234");
        twitterDto.setUserName("ravi_k");
        twitterDto.setPassword("ravi@tweet");
        System.out.println(twitterDto);



        Twitter twitter = new Twitter();
        twitter.newAccount(twitterDto);
        twitter.getTwitterUserDetails();
    }
}
