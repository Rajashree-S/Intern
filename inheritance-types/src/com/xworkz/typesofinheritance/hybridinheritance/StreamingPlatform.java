package com.xworkz.typesofinheritance.hybridinheritance;

public class StreamingPlatform extends Movies{

    public void platformName() {
        System.out.println("Netflix");
    }

    public void subscriptionType() {
        System.out.println("Premium");
    }

    public void monthlyCost() {
        System.out.println("₹649");
    }

    public void totalUsers() {
        System.out.println("250 million users");
    }

    public void availableLanguages() {
        System.out.println("English, Hindi, Spanish, French");
    }

    public void contentType() {
        System.out.println("Movies, Series, Documentaries");
    }

    public void downloadAvailable() {
        System.out.println("Yes");
    }

    public void trialPeriod() {
        System.out.println("No free trial");
    }
}
