package com.xworkz.showroom;

import com.xworkz.showroom.manager.Manager;
import com.xworkz.showroom.showroomapp.Showroom;
import com.xworkz.showroom.staff.Staff;

public class ShowroomRunner {

    public static void main(String[] args) {

        System.out.println("Main Started...");

        String managersNames[] = {"Ashok" , "Ravindra" , "Shilpa"};
        String staffNames[] = {"Rio" , "Laila"};

        Manager managers[] = new Manager[1];

        Manager manage = new Manager();
        manage.managerId =12;
        manage.managerName = managersNames;

        managers[0] = manage;

        Staff staffDet[] = new Staff[1];

        Staff det = new Staff();
        det.staffId = 7;
        det.staffName = staffNames;

        staffDet[0] = det;

        Showroom ref = new Showroom();
        ref.showroomId = 1;
        ref.showroomName = "Bikerss";
        ref.manager = managers;
        ref.staff = staffDet;
        ref.getShowroomDetails();




        System.out.println("Main Ended...");
    }
}
