package com.xworkz.linkedinApp;

import com.xworkz.linkedinApp.Constants.Education;
import com.xworkz.linkedinApp.Constants.Software;
import com.xworkz.linkedinApp.linkdin.LinkedIn;
import com.xworkz.linkedinApp.linkdindto.LinkdinUserDto;

public class LinkdinRunner {
    public static void main(String arg[]){

        LinkdinUserDto linkdinDto = new LinkdinUserDto();
        linkdinDto.setEmail("Alex@123");
        linkdinDto.setName("Alex");
        linkdinDto.setPhnNo(5638298643l);
        linkdinDto.setSoftwareskills(Software.java);
        linkdinDto.setEduaction(Education.DEGREE);


        LinkedIn linked = new LinkedIn();
        linked.User(linkdinDto);
        linked.getLinkedinUserDetails();
    }

}
