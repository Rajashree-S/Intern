package com.xworkz.encapsulation.threads;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ThreadsUserDto {

    private String userName;
    private String email;
    private String phoneNumber;
    private String bio;
    private String postsCount;

    @Override
    public String toString() {
        return "ThreadsUserDto : (userName : " + this.userName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , bio : " + this.bio +
                " , postsCount : " + this.postsCount + ") ";
    }
}
