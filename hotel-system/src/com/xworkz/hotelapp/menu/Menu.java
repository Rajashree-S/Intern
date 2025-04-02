package com.xworkz.hotelapp.menu;

public class Menu {

   public int menuId;
   public String menuName;
   public String ingridents[];


   public void getMenuDetails(){
      System.out.println("The menu ");
      System.out.println("The menu id is :"+this.menuId);
      System.out.println("The menu name is :"+this.menuName);
      System.out.println("The ingridents for menu are :");
      for(String ingrident : ingridents){
         System.out.println(ingrident);

      }
   }



}
