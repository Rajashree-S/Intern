package com.xworkz.learningApp.learning;

import com.xworkz.learningApp.learningdto.LearningUserDto;

public class Learning {

    LearningUserDto learningDto;
    public  boolean User(LearningUserDto learningDto) {
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(learningDto);
        if (uservalid == true){
            isUserRegisterd = true;
            this.learningDto = learningDto;
            System.out.println("User Registered!!");
    }
        else{
            System.out.println("not registered");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(LearningUserDto learningDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isCourseType = false;
        boolean isPaymentType = false;

        if(learningDto.getEmail()!=null){
            isEmail = true;
        }
        if(learningDto.getName()!=null){
            isName = true;
        }
        if(learningDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(learningDto.getCourseType()!=null){
            isCourseType = true;
        }
        if(learningDto.getPaymentType()!=null){
            isPaymentType = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isCourseType == true && isPaymentType == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }

    public void displayUserDetails(){
        System.out.println("----------------------------------");

        System.out.println("Email id :"+ this.learningDto.getEmail());
        System.out.println("User Name:"+ this.learningDto.getName());
        System.out.println("Phone number :"+ this.learningDto.getPhnNo());
        System.out.println("payment type :"+ this.learningDto.getPaymentType());
        System.out.println("course type :"+ this.learningDto.getCourseType());

        System.out.println("----------------------------------");
    }

}
