package com.xworkz.encapsulation.redbus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RedBusUserDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String boardingPoint;
    private String destination;

    @Override
    public String toString() {
        return "RedBusUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , boardingPoint : " + this.boardingPoint +
                " , destination : " + this.destination + ") ";
    }
}
