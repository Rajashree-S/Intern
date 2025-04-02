package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.branches.Branches;
import com.xworkz.hotelapp.menu.Menu;

public class Hotel {

    public int hotelId;
    public String location;
    public String branches[];
    public Menu menus[];

    public void getHotelInfo(){

        System.out.println("The hotel id is : "+this.hotelId);
        System.out.println("The location is :"+this.location);
        System.out.println("The menu list is :"+this.menus);
        for(Menu menu : menus){
            menu.getMenuDetails();
        }




    }







}
