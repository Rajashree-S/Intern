package com.xworkz.encapsulation.telegram;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TelegramUserDto {

    private String userName;
    private String phoneNumber;
    private String email;
    private String bio;
    private String lastSeen;

    @Override
    public String toString() {
        return "TelegramUserDto : (userName : " + this.userName +
                " , phoneNumber : " + this.phoneNumber +
                " , email : " + this.email +
                " , bio : " + this.bio +
                " , lastSeen : " + this.lastSeen + ") ";
    }
}
