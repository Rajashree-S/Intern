package com.xworkz.supermarket.supermarketapp;

import com.xworkz.supermarket.product.Product;
import com.xworkz.supermarket.sections.Section;

public class Supermarket {

    public int supermarketId ;
    public String supermarketName;
    public static Section[] sections;
    public static Product[] products;

    public static void getSupermarketDetails(){

        for (Section section : sections){
            section.getSectionDetails();
        }

        for(Product product : products){
            product.getProductDetails();
        }
    }
}
