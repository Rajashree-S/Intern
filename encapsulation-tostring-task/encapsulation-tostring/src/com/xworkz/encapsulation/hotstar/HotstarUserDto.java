package com.xworkz.encapsulation.hotstar;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HotstarUserDto {

    private String subscriberName;
    private String email;
    private String mobileNumber;
    private String subscriptionType;
    private String region;

    @Override
    public String toString() {
        return "HotstarUserDto : (subscriberName : " + this.subscriberName +
                " , email : " + this.email +
                " , mobileNumber : " + this.mobileNumber +
                " , subscriptionType : " + this.subscriptionType +
                " , region : " + this.region + ") ";
    }
}