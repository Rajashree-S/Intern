package com.xworkz.encapsulation.uber;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UberUserDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String pickupLocation;
    private String dropLocation;

    @Override
    public String toString() {
        return "UberUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , pickupLocation : " + this.pickupLocation +
                " , dropLocation : " + this.dropLocation + ") ";
    }
}
