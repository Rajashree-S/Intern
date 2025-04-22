package com.xworkz.encapsulation.rapido;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RapidoUserDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String pickupLocation;
    private String dropLocation;

    @Override
    public String toString() {
        return "RapidoUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , pickupLocation : " + this.pickupLocation +
                " , dropLocation : " + this.dropLocation + ") ";
    }
}
