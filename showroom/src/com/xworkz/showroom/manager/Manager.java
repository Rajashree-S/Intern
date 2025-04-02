package com.xworkz.showroom.manager;

public class Manager {

    public int managerId;
    public String managerName[];

    public void getManagerDetails(){

        System.out.println("--------Manager Details---------");
        System.out.println("The manager id is :"+this.managerId);
        System.out.println("The manager names are : ");
        for (String managerNames : managerName){
            System.out.println(managerNames);
        }

    }


}
