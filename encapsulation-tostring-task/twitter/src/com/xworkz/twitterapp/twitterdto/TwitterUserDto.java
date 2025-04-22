package com.xworkz.twitterapp.twitterdto;

import com.xworkz.twitterapp.constants.Gender;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TwitterUserDto {

    private String fullName;
    private String dob;
    private Gender gender;
    private String email;
    private String mobile;
    private String password;
    private String userName;


    public String toString(){
        return "TwitterUserDto : (fullName : "+this.fullName+
                " , dob : " + this.dob +
                " , gender : " + this.gender+
                " , email : " +this.email+
                " , mobile : " +this.mobile+
                " , password : " +this.password+
                " , userName : " +this.userName+ ") ";
    }


    /*public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
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
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }*/


}
