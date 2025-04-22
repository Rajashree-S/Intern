package com.xworkz.encapsulation.netflix;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NetflixUserDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String subscriptionPlan;
    private String region;

    @Override
    public String toString() {
        return "NetflixUserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , subscriptionPlan : " + this.subscriptionPlan +
                " , region : " + this.region + ") ";
    }
}
