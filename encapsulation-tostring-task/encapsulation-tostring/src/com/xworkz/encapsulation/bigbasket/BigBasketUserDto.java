package com.xworkz.encapsulation.bigbasket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BigBasketUserDto {

    private String customerName;
    private String deliveryLocation;
    private String phoneNumber;
    private String email;
    private String preferredPayment;

    @Override
    public String toString() {
        return "BigBasketUserDto : (customerName : " + this.customerName +
                " , deliveryLocation : " + this.deliveryLocation +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , preferredPayment : " + this.preferredPayment + ") ";
    }
}