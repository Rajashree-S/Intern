package com.xworkz.learningApp;

import com.xworkz.learningApp.Constants.Course;
import com.xworkz.learningApp.Constants.Payment;
import com.xworkz.learningApp.learning.Learning;
import com.xworkz.learningApp.learningdto.LearningUserDto;

public class LearningRunner {
    public static void main(String arg[]){

        LearningUserDto learningDto = new LearningUserDto();
        learningDto.setEmail("charlie@123");
        learningDto.setName("Charlie");
        learningDto.setPhnNo(5638298643l);
        learningDto.setPaymentType(Payment.online);
        learningDto.setCourseType(Course.java);
        System.out.println(learningDto);



        Learning learn = new Learning();
        learn.User(learningDto);
        learn.displayUserDetails();
    }
}
