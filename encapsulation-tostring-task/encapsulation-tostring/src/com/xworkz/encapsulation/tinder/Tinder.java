package com.xworkz.encapsulation.tinder;

public class Tinder {

    TinderUserDto tinderDto;

    public boolean createAccount(TinderUserDto tinderDto) {
        boolean isRegistered = false;
        boolean validated = validateAccount(tinderDto);

        if (validated) {
            isRegistered = true;
            this.tinderDto = tinderDto;
        } else {
            System.out.println("User details are invalid....");
        }

        return isRegistered;
    }

    public boolean validateAccount(TinderUserDto tinderDto) {
        boolean isValid = false;

        boolean nameValid = false;
        boolean birthDateValid = false;
        boolean genderValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean passwordValid = false;
        boolean userNameValid = false;

        if (tinderDto.getName() != null && !tinderDto.getName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Name!!!!");
        }

        if (tinderDto.getBirthDate() != null && !tinderDto.getBirthDate().isEmpty()) {
            birthDateValid = true;
        } else {
            System.out.println("Invalid Birth Date!!!!");
        }

        if (tinderDto.getGender() != null && !tinderDto.getGender().isEmpty()) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!!!!");
        }

        if (tinderDto.getEmail() != null && !tinderDto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!!!");
        }

        if (tinderDto.getPhoneNumber() != null && !tinderDto.getPhoneNumber().isEmpty()) {
            phoneValid = true;
        } else {
            System.out.println("Invalid Phone Number!!!!");
        }

        if (tinderDto.getPassword() != null && !tinderDto.getPassword().isEmpty()) {
            passwordValid = true;
        } else {
            System.out.println("Invalid Password!!!!");
        }

        if (tinderDto.getUserName() != null && !tinderDto.getUserName().isEmpty()) {
            userNameValid = true;
        } else {
            System.out.println("Invalid Username!!!!");
        }

        if (nameValid && birthDateValid && genderValid && emailValid &&
                phoneValid && passwordValid && userNameValid) {
            isValid = true;
        }

        return isValid;
    }
}
