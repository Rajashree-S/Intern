package com.xworkz.encapsulation.pinterest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PinterestUserDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String favoriteBoards;
    private String recentPins;

    @Override
    public String toString() {
        return "PinterestUserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , favoriteBoards : " + this.favoriteBoards +
                " , recentPins : " + this.recentPins + ") ";
    }
}
