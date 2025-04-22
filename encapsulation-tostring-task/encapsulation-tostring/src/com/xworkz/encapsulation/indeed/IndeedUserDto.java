package com.xworkz.encapsulation.indeed;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IndeedUserDto {

    private String candidateName;
    private String email;
    private String phoneNumber;
    private String highestQualification;
    private String preferredJobLocation;

    @Override
    public String toString() {
        return "IndeedUserDto : (candidateName : " + this.candidateName +
                " , email : " + this.email +
                " , phoneNumber : " + this.phoneNumber +
                " , highestQualification : " + this.highestQualification +
                " , preferredJobLocation : " + this.preferredJobLocation + ") ";
    }
}
