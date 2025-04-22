package com.xworkz.encapsulation.ajio;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AjioUserDto {

    private String customerName;
    private String deliveryAddress;
    private String contactNumber;
    private String email;
    private String paymentMethod;

    @Override
    public String toString() {
        return "AjioUserDto : (customerName : " + this.customerName +
                " , deliveryAddress : " + this.deliveryAddress +
                " , contactNumber : " + this.contactNumber +
                " , email : " + this.email +
                " , paymentMethod : " + this.paymentMethod + ") ";
    }
}

