package com.xworkz.encapsulation.duolingo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DuolingoUserDto {

    private String learnerName;
    private String selectedLanguage;
    private String email;
    private String learningGoal;

    @Override
    public String toString() {
        return "DuolingoUserDto : (learnerName : " + this.learnerName +
                " , selectedLanguage : " + this.selectedLanguage +
                " , email : " + this.email +
                " , learningGoal : " + this.learningGoal + ") ";
    }
}