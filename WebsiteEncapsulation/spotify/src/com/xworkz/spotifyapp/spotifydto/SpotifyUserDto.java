package com.xworkz.spotifyapp.spotifydto;

import com.xworkz.spotifyapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpotifyUserDto {

    private int userId;
    private String userName;
    private String emailId;
    private String phoneNo;
    private String dob;
    private Gender gender;

    /*public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }*/


}
