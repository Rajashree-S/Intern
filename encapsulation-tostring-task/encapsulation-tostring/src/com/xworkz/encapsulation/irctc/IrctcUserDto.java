package com.xworkz.encapsulation.irctc;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IrctcUserDto {

    private String passengerName;
    private String email;
    private String phoneNumber;
    private String travelClass;
    private String destination;

    @Override
    public String toString() {
        return "IrctcUserDto : (passengerName : " + this.passengerName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , travelClass : " + this.travelClass +
                " , destination : " + this.destination + ") ";
    }
}
