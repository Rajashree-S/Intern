package com.xworkz.encapsulation.snapdeal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SnapDealCustomerDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String preferredPaymentMethod;
    private String shippingAddress;

    @Override
    public String toString() {
        return "SnapdealUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , preferredPaymentMethod : " + this.preferredPaymentMethod +
                " , shippingAddress : " + this.shippingAddress + ") ";
    }
}
