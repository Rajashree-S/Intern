package com.xworkz.showroom.showroomapp;

import com.xworkz.showroom.manager.Manager;
import com.xworkz.showroom.staff.Staff;

public class Showroom {

    public int showroomId;
    public String showroomName;
    public Manager manager[];
    public Staff staff[];


    public void getShowroomDetails(){

        System.out.println("------------The showroom details--------");
        System.out.println("The showroom id is :"+this.showroomId);
        System.out.println("The showroom name is :"+this.showroomName);
        System.out.println("The Managers are :");
        for (Manager manage : manager){
            manage.getManagerDetails();
        }
        System.out.println("The Staff are :");
        for (Staff staffDet : staff){
            staffDet.getStaffDetails();
        }

    }
}
