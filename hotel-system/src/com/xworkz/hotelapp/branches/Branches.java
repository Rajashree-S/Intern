package com.xworkz.hotelapp.branches;

public class Branches {

    public String hotelBranches[];

    public void getBranchDetails(){
        System.out.println("The hotel branches are :");
        for(String branch : hotelBranches){
            System.out.println(branch);
        }
    }
}
