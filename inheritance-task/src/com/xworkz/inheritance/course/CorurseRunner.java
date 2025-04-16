package com.xworkz.inheritance.course;

import com.xworkz.inheritance.course.corursedetails.Course;
import com.xworkz.inheritance.course.webtech.Web;

public class CorurseRunner {

    public static void main(String[] args) {

        Course course = new Course();
        course.courseCredits();
        course.courseDuration();
        course.courseId();
        course.courseInstructor();
        course.courseName();

        Course course1 = new Web();
        course1.courseCredits();
        course1.courseDuration();
        course1.courseId();
        course1.courseInstructor();
        course1.courseName();


        Web web = new Web();
        web.webTechFrameworks();
        web.webTechLanguages();
        web.webTechProjects();
        web.webTechTools();
        web.webTechTopics();

    }
}
