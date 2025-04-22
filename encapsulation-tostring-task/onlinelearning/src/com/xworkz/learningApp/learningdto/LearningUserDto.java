package com.xworkz.learningApp.learningdto;

import com.xworkz.learningApp.Constants.Payment;
import com.xworkz.learningApp.Constants.Course;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LearningUserDto {

    private String name;
    private String email;
    private long phnNo;
    private Course courseType;
    private Payment paymentType;

    public String toString(){
        return "LearningUserDto : (name : "+this.name+
                " , email : " + this.email +
                " , phnNo : " + this.phnNo+
                " , courseType : " +this.courseType+
                " , paymentType : " +this.paymentType+ ") ";
    }

    /*public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public long getPhnNo(){
        return phnNo;
    }
    public void setPhnNo(long phnNo){
        this.phnNo = phnNo;
    }

    public Course getCourseType(){
        return courseType;
    }
    public void setCourseType(Course courseType){
        this.courseType = courseType;
    }

    public Payment getPaymentType(){
        return paymentType;
    }
    public void setPaymentType(Payment paymentType){
        this.paymentType = paymentType;
    }*/
}
