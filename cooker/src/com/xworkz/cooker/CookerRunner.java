package com.xworkz.cooker;

import com.xworkz.cooker.cookerdetails.Cooker;

public class CookerRunner {

    public static void main(String[] args) {

    Cooker cooker1 = new Cooker();
    cooker1.setCookerId(1);
    cooker1.setBrand("Butterfly");
    cooker1.setCapacity("2 litres");
    cooker1.setMaterial("Stainless steel");
    cooker1.setFinishType("Glossy");

    int ref =cooker1.getCookerId();
    System.out.println("Cooker ID: " + ref);
    String ref1 = cooker1.getBrand();
    System.out.println("Cooker Brand: " +ref1);
    String ref2 = cooker1.getCapacity();
    System.out.println("Cooker Capacity: "+ref2);
    String ref3 = cooker1.getMaterial();
    System.out.println("Cooker Material:"+ref3);
    String ref4 = cooker1.getFinishType();
    System.out.println("Cooker FinishType:"+ref4);
    System.out.println("----------------------------------");

        Cooker cooker2 = new Cooker();
        cooker2.setCookerId(2);
        cooker2.setBrand("Prestige");
        cooker2.setCapacity("3 litres");
        cooker2.setMaterial("Stainless steel");
        cooker2.setFinishType("Glossy");

        int ref5 =cooker2.getCookerId();
        System.out.println("Cooker ID: " + ref5);
        String ref6 = cooker2.getBrand();
        System.out.println("Cooker Brand: " +ref6);
        String ref7 = cooker2.getCapacity();
        System.out.println("Cooker Capacity: "+ref7);
        String ref8 = cooker2.getMaterial();
        System.out.println("Cooker Material:"+ref8);
        String ref9 = cooker2.getFinishType();
        System.out.println("Cooker FinishType:"+ref9);
        System.out.println("----------------------------------");

        Cooker cooker3 = new Cooker();
        cooker3.setCookerId(3);
        cooker3.setBrand("Metalux");
        cooker3.setCapacity("5 litres");
        cooker3.setMaterial("Stainless steel");
        cooker3.setFinishType("Glossy");

        int ref10 =cooker3.getCookerId();
        System.out.println("Cooker ID: " + ref10);
        String ref11 = cooker3.getBrand();
        System.out.println("Cooker Brand: " +ref11);
        String ref12 = cooker3.getCapacity();
        System.out.println("Cooker Capacity: "+ref12);
        String ref13 = cooker3.getMaterial();
        System.out.println("Cooker Material:"+ref13);
        String ref14 = cooker3.getFinishType();
        System.out.println("Cooker FinishType:"+ref14);
        System.out.println("----------------------------------");

        Cooker cooker4 = new Cooker();
        cooker4.setCookerId(4);
        cooker4.setBrand("Pigeon");
        cooker4.setCapacity("2 litres");
        cooker4.setMaterial("Stainless steel");
        cooker4.setFinishType("Glossy");

        int ref15 =cooker4.getCookerId();
        System.out.println("Cooker ID: " + ref15);
        String ref16 = cooker4.getBrand();
        System.out.println("Cooker Brand: " +ref16);
        String ref17 = cooker4.getCapacity();
        System.out.println("Cooker Capacity: "+ref17);
        String ref18 = cooker4.getMaterial();
        System.out.println("Cooker Material:"+ref18);
        String ref19 = cooker4.getFinishType();
        System.out.println("Cooker FinishType:"+ref19);
        System.out.println("----------------------------------");

        Cooker cooker5 = new Cooker();
        cooker5.setCookerId(5);
        cooker5.setBrand("Hawkins");
        cooker5.setCapacity("5 litres");
        cooker5.setMaterial("Stainless steel");
        cooker5.setFinishType("Glossy");

        int ref20 =cooker5.getCookerId();
        System.out.println("Cooker ID: " + ref20);
        String ref21 = cooker5.getBrand();
        System.out.println("Cooker Brand: " +ref21);
        String ref22 = cooker5.getCapacity();
        System.out.println("Cooker Capacity: "+ref22);
        String ref23 = cooker5.getMaterial();
        System.out.println("Cooker Material:"+ref23);
        String ref24 = cooker5.getFinishType();
        System.out.println("Cooker FinishType:"+ref24);
        System.out.println("----------------------------------");

    }
}
