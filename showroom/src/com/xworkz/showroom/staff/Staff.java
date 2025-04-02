package com.xworkz.showroom.staff;

public class Staff {

    public String staffName[];
    public int staffId;

    public void getStaffDetails(){
        System.out.println("----------Staff Details--------");
        System.out.println("The Staff id is :"+this.staffId);
        System.out.println("The Staff names are :");
        for (String staffNames : staffName){
            System.out.println(staffNames);
        }
    }
}
