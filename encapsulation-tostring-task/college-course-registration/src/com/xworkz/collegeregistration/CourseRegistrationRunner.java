package com.xworkz.collegeregistration;

import com.xworkz.collegeregistration.dto.CourseRegistrationDto;
import com.xworkz.collegeregistration.service.CourseRegistration;

public class CourseRegistrationRunner {

    public static void main(String[] args) {

        CourseRegistrationDto dto = new CourseRegistrationDto();
        dto.setStudentName("Akhil Raj");
        dto.setStudentId("S123456");
        dto.setCourseName("Data Structures");
        dto.setCourseCode("CS201");
        dto.setDepartment("Computer Science");
        dto.setSemester("4th");
        dto.setEmail("akhil.raj@example.com");
        dto.setContactNumber("9876543210");
        System.out.println(dto);



        CourseRegistration registration = new CourseRegistration();
        registration.registerStudent(dto);
        registration.getCourseDetails();
    }
}
