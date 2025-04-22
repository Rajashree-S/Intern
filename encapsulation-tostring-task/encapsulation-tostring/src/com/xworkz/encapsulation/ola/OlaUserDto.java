package com.xworkz.encapsulation.ola;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OlaUserDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String pickupLocation;
    private String dropLocation;

    @Override
    public String toString() {
        return "OlaUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , pickupLocation : " + this.pickupLocation +
                " , dropLocation : " + this.dropLocation + ") ";
    }
}
