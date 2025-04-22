package com.xworkz.encapsulation.blinkit;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BlinkitCustomerDto {

    private String userName;
    private String deliveryAddress;
    private String contactNumber;
    private String paymentMode;

    @Override
    public String toString() {
        return "BlinkitUserDto : (userName : " + this.userName +
                " , deliveryAddress : " + this.deliveryAddress +
                " , contactNumber : " + this.contactNumber +
                " , paymentMode : " + this.paymentMode + ") ";
    }
}
