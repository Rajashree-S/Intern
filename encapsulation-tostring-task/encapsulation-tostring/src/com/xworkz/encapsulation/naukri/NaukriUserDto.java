package com.xworkz.encapsulation.naukri;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NaukriUserDto {

    private String candidateName;
    private String email;
    private String phoneNumber;
    private String currentJobTitle;
    private String preferredJobLocation;

    @Override
    public String toString() {
        return "NaukriUserDto : (candidateName : " + this.candidateName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , currentJobTitle : " + this.currentJobTitle +
                " , preferredJobLocation : " + this.preferredJobLocation + ") ";
    }
}
