package com.xworkz.encapsulation.meesho;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MeeshoCustomerDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String deliveryAddress;
    private String preferredPaymentMethod;
    private String orderHistory;

    @Override
    public String toString() {
        return "MeeshoUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , deliveryAddress : " + this.deliveryAddress +
                " , preferredPaymentMethod : " + this.preferredPaymentMethod +
                " , orderHistory : " + this.orderHistory + ") ";
    }
}
