package com.xworkz.encapsulation.shopsy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ShopsyCustomerDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String preferredCategory;
    private String shippingAddress;

    @Override
    public String toString() {
        return "ShopsyUserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , preferredCategory : " + this.preferredCategory +
                " , shippingAddress : " + this.shippingAddress + ") ";
    }
}
