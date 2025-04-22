package com.xworkz.encapsulation.indeed;

public class IndeedRunner {

    public static void main(String[] args) {

        IndeedUserDto indeedDto = new IndeedUserDto();
        indeedDto.setCandidateName("Sakshi Nair");
        indeedDto.setEmail("sakshi.nair@indeed.com");
        indeedDto.setPhoneNumber("9001234567");
        indeedDto.setHighestQualification("MBA in HR");
        indeedDto.setPreferredJobLocation("Mumbai");

        System.out.println(indeedDto);
    }
}
