package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constants.BloodGroup;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientDto {

    private String patientName;
    private int age;
    private String dob;
    private String gender;
    private String email;
    private String contactNumber;
    private BloodGroup bloodGroup;
    private String diagnosis;

    public String toString(){
        return "PatientDto : (patientName : "+this.patientName+
                " , age : " + this.age +
                " , dob : " + this.dob+
                " , gender : " +this.gender+
                " , email : " +this.email+
                " , contactNumber : " +this.contactNumber+
                " , bloodGroup : " +this.bloodGroup+
                " , diagnosis : " +this.diagnosis+ ") ";
    }


    /*public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }*/
}
