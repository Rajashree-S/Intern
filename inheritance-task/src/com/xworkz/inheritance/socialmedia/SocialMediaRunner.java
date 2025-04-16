package com.xworkz.inheritance.socialmedia;

import com.xworkz.inheritance.socialmedia.instagram.Instagram;
import com.xworkz.inheritance.socialmedia.socialmediadetails.SocialMedia;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.platformName();
        socialMedia.platformType();
        socialMedia.platformOwner();
        socialMedia.platformLaunchYear();
        socialMedia.platformUsage();

        SocialMedia socialMedia1 = new Instagram();
        socialMedia1.platformFunction();
        socialMedia1.platformName();
        socialMedia1.platformType();
        socialMedia1.platformOwner();
        socialMedia1.platformLaunchYear();

        Instagram instagram = new Instagram();
        instagram.instagramFeatures();
        instagram.instagramUsers();
        instagram.instagramOwnership();
        instagram.instagramPopularity();
        instagram.instagramMonetization();
    }
}
