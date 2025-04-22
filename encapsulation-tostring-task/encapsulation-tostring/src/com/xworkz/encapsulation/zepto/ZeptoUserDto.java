package com.xworkz.encapsulation.zepto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ZeptoUserDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String preferredDeliveryTime;
    private String deliveryAddress;

    @Override
    public String toString() {
        return "ZeptoUserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , preferredDeliveryTime : " + this.preferredDeliveryTime +
                " , deliveryAddress : " + this.deliveryAddress + ") ";
    }
}
