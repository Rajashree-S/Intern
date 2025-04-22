package com.xworkz.encapsulation.threads;

public class ThreadsRunner {

    public static void main(String[] args) {

        ThreadsUserDto threadsDto = new ThreadsUserDto();
        threadsDto.setUserName("Alice Johnson");
        threadsDto.setEmail("alice.johnson@threads.com");
        threadsDto.setPhoneNumber("9876543210");
        threadsDto.setBio("Content Creator");
        threadsDto.setPostsCount("500");

        System.out.println(threadsDto);
    }
}
