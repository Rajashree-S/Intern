package com.xworkz.encapsulation.naukri;

public class NaukriRunner {

    public static void main(String[] args) {

        NaukriUserDto naukriDto = new NaukriUserDto();
        naukriDto.setCandidateName("Priya Yadav");
        naukriDto.setEmail("priya.yadav@naukri.com");
        naukriDto.setPhoneNumber("9876543210");
        naukriDto.setCurrentJobTitle("Software Developer");
        naukriDto.setPreferredJobLocation("Pune");

        System.out.println(naukriDto);
    }
}
