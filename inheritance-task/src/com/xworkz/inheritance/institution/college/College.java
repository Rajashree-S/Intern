package com.xworkz.inheritance.institution.college;

import com.xworkz.inheritance.institution.institutionDetails.Institution;

public class College extends Institution {
    public void collegeCourses() {
        System.out.println("The courses offered by the college");
    }

    public void collegeDepartments() {
        System.out.println("The departments in the college");
    }

    public void collegeFacultyCount() {
        System.out.println("The number of faculty members");
    }

    public void collegeHostelFacility() {
        System.out.println("Hostel facility availability");
    }

    public void collegeRanking() {
        System.out.println("The college ranking");
    }
}
