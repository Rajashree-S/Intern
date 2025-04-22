package com.xworkz.linkedinApp.linkdin;

import com.xworkz.linkedinApp.linkdindto.LinkdinUserDto;

public class LinkedIn {

    LinkdinUserDto linkdinDto;

    public  boolean User(LinkdinUserDto linkdinDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(linkdinDto);
        if(uservalid == true ) {
            isUserRegisterd = true;
             this.linkdinDto =linkdinDto;
            System.out.println("User registered");
        }else{
            System.out.println("not register");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(LinkdinUserDto linkdinDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isSoftware = false;
        boolean isEducation = false;

        if(linkdinDto.getEmail()!=null){
            isEmail = true;
        }
        if(linkdinDto.getName()!=null){
            isName = true;
        }
        if(linkdinDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(linkdinDto.getSoftwareskills()!=null){
            isSoftware = true;
        }
        if(linkdinDto.getEduaction()!=null){
            isEducation = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isSoftware == true && isEducation == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }
    public void getLinkedinUserDetails() {
        System.out.println("----------------------------------");

        System.out.println("User Name:" + this.linkdinDto.getName());
        System.out.println("EmailId :" + this.linkdinDto.getEmail());
        System.out.println("phone number :" + this.linkdinDto.getPhnNo());
        System.out.println("Education :" + this.linkdinDto.getEduaction());
        System.out.println("Software skills :" + this.linkdinDto.getSoftwareskills());
        System.out.println("----------------------------------");
    }

}
