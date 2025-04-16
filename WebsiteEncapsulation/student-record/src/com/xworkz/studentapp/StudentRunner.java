package com.xworkz.studentapp;

import com.xworkz.studentapp.constants.Gender;
import com.xworkz.studentapp.studentdto.StudentDto;
import com.xworkz.studentapp.managestudent.Student;

public class StudentRunner {

    public static void main(String[] args) {



        StudentDto studentDto = new StudentDto();
        studentDto.setStudentName("Meghana");
        studentDto.setRollNumber(123);
        studentDto.setDob("12/09/2002");
        studentDto.setGender(Gender.female);
        studentDto.setEmail("meghana@gmail.com");
        studentDto.setMobile("9876543210");
        studentDto.setDepartment("Computer Science");
        studentDto.setPercentage(87.5);


        Student student = new Student();
        student.registerStudent(studentDto);
        student.getStudentDetails();
    }
}
