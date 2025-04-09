package com.xworkz.fitnessapp.generate;

import com.xworkz.fitnessapp.dto.FitnessUserProfileDto;

public class FitnessApp {

    FitnessUserProfileDto dto;

    public boolean registerUser(FitnessUserProfileDto dto) {
        boolean registered = false;
        boolean validated = validateProfile(dto);
        if (validated) {
            registered = true;
            this.dto = dto;
            System.out.println("User registered successfully!");
        } else {
            System.out.println("User profile validation failed!");
        }
        return registered;
    }

    public boolean validateProfile(FitnessUserProfileDto dto) {

        boolean userValid = false;
        boolean emailValid = false;
        boolean ageValid = false;
        boolean weightValid = false;
        boolean heightValid = false;
        boolean goalValid = false;
        boolean workoutTimeValid = false;

        if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
            userValid = true;
        } else {
            System.out.println("Invalid Username!");
        }

        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!");
        }

        if (dto.getAge() > 0) {
            ageValid = true;
        } else {
            System.out.println("Invalid Age!");
        }

        if (dto.getWeight() > 0) {
            weightValid = true;
        } else {
            System.out.println("Invalid Weight!");
        }

        if (dto.getHeight() > 0) {
            heightValid = true;
        } else {
            System.out.println("Invalid Height!");
        }

        if (dto.getGoal() != null) {
            goalValid = true;
        } else {
            System.out.println("Invalid Fitness Goal!");
        }

        if (dto.getPreferredWorkoutTime() != null && !dto.getPreferredWorkoutTime().isEmpty()) {
            workoutTimeValid = true;
        } else {
            System.out.println("Invalid Workout Time!");
        }

        return userValid && emailValid && ageValid && weightValid && heightValid && goalValid && workoutTimeValid;
    }
    public void getfitnessDetails() {
        System.out.println("----------------------------------");
        System.out.println("User Name: " + this.dto.getUserName());
        System.out.println("Email: " + this.dto.getEmail());
        System.out.println("Age: " + this.dto.getAge());
        System.out.println("Weight: " + this.dto.getWeight());
        System.out.println("Height: " + this.dto.getHeight());
        System.out.println("Fitness Goal: " + this.dto.getGoal());
        System.out.println("Workout Time: " + this.dto.getPreferredWorkoutTime());
        System.out.println("----------------------------------");
    }
}
