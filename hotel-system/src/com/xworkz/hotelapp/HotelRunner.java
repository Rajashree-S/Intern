package com.xworkz.hotelapp;

import com.xworkz.hotelapp.branches.Branches;
import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.menu.Menu;

public class HotelRunner {

    public static void main(String[] args) {

        System.out.println("Main Started..");


        String hotelBranches[] = {"Vijayanagar" , "Rt nagar"};



        //1st step
        //constructor
        Hotel ref = new Hotel();
        ref.hotelId = 123;
        ref.location = "Rt nagar";
        ref.branches = hotelBranches;

        Menu menu1 = new Menu();
        menu1.menuId = 1;
        menu1.menuName = "Tea";
        String ingridentsTea[] = {"tea powder","Milk" , "water"};
        menu1.ingridents = ingridentsTea;

        Menu menu2 = new Menu();
        menu2.menuId = 2;
        menu2.menuName = "Biryani";
        String ingridentsBiryani[] = {"Rice", "Oil" ,"chicken"};
        menu2.ingridents = ingridentsBiryani;

        Menu menus[] = new Menu[2];

        menus[0] = menu1;
        menus[1] = menu2;

        //association (has a relationship)
        ref.menus = menus;





        System.out.println();
        System.out.println("Main Ended...");
    }
}
