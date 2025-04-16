package com.xworkz.inheritance.institution;

import com.xworkz.inheritance.institution.college.College;
import com.xworkz.inheritance.institution.institutionDetails.Institution;

public class InstitutionRunner {

    public static void main(String[] args) {

                Institution institution = new Institution();
                institution.institutionName();
                institution.institutionLocation();
                institution.institutionType();
                institution.institutionAffiliation();
                institution.institutionEstablishedYear();

                Institution institution1 = new College();
                institution1.institutionName();
                institution1.institutionLocation();
                institution1.institutionType();
                institution1.institutionAffiliation();
                institution1.institutionEstablishedYear();

                College college = new College();
                college.collegeCourses();
                college.collegeDepartments();
                college.collegeFacultyCount();
                college.collegeHostelFacility();
                college.collegeRanking();
            }
}
