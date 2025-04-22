package com.xworkz.encapsulation.zee5;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Zee5UserDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String subscriptionPlan;
    private String favoriteShows;

    @Override
    public String toString() {
        return "Zee5UserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , subscriptionPlan : " + this.subscriptionPlan +
                " , favoriteShows : " + this.favoriteShows + ") ";
    }
}
