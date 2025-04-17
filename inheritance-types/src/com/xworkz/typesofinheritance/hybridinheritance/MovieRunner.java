package com.xworkz.typesofinheritance.hybridinheritance;

public class MovieRunner {
    public static void main(String[] args) {

        System.out.println("-----Movies Details-----");
        Movies movies = new Movies();
        movies.movieName();
        movies.movieGenre();
        movies.movieDuration();
        movies.movieLanguage();
        movies.movieCertification();
        movies.leadActor();
        movies.releaseYear();
        movies.movieRating();

        System.out.println("-----Theater Details-----");
        Theater theater = new Theater();
        theater.theaterName();
        theater.location();
        theater.parkingAvailable();
        theater.screenType();
        theater.seatingCapacity();
        theater.showTimings();
        theater.ticketPrice();
        theater.totalScreens();

        System.out.println("-----Streaming platform Details-----");
        StreamingPlatform platform = new StreamingPlatform();
        platform.platformName();
        platform.monthlyCost();
        platform.availableLanguages();
        platform.subscriptionType();
        platform.totalUsers();
        platform.trialPeriod();
        platform.downloadAvailable();
        platform.contentType();

        System.out.println("-----User Login Details-----");
        UserLogin login = new UserLogin();
        login.userName();
        login.password();
        login.lastLogin();
        login.loginStatus();
        login.accountType();
        login.emailId();
        login.mobileNumber();
        login.membershipValidity();

    }

}
