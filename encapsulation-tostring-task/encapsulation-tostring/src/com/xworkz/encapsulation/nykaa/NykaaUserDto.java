package com.xworkz.encapsulation.nykaa;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NykaaUserDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String preferredBrand;
    private String shippingAddress;

    @Override
    public String toString() {
        return "NykaaUserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , preferredBrand : " + this.preferredBrand +
                " , shippingAddress : " + this.shippingAddress + ") ";
    }
}
