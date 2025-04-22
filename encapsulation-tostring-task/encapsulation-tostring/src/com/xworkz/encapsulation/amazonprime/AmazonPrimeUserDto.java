package com.xworkz.encapsulation.amazonprime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AmazonPrimeUserDto {

    private String subscriberName;
    private String email;
    private String contactNumber;
    private String subscriptionType;
    private String paymentStatus;

    @Override
    public String toString() {
        return "AmazonPrimeUserDto : (subscriberName : " + this.subscriberName +
                " , email : " + this.email +
                " , contactNumber : " + this.contactNumber +
                " , subscriptionType : " + this.subscriptionType +
                " , paymentStatus : " + this.paymentStatus + ") ";
    }
}