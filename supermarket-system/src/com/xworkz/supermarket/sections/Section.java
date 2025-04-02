package com.xworkz.supermarket.sections;

public class Section {

    public int sectionId;
    public String sections[];

    public void getSectionDetails(){

        System.out.println("------- The Section details ------");
        System.out.println("The section id is :"+this.sectionId);
        System.out.println("The Section names are ");
        for (String section : sections){
            System.out.println(section);
        }
    }

}
