package com.xworkz.encapsulation.tinder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TinderUserDto {

    private String name;
    private String birthDate;
    private String gender;
    private String email;
    private String phoneNumber;
    private String password;
    private String userName;

    @Override
    public String toString() {
        return "TinderUserDto : (name : " + this.name +
                " , birthDate : " + this.birthDate +
                " , gender : " + this.gender +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , password : " + this.password +
                " , userName : " + this.userName + ") ";
    }
}