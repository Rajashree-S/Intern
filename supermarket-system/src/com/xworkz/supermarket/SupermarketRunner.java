package com.xworkz.supermarket;

import com.xworkz.supermarket.product.Product;
import com.xworkz.supermarket.sections.Section;
import com.xworkz.supermarket.supermarketapp.Supermarket;

public class SupermarketRunner {

    public static void main(String[] args) {

        System.out.println("Main Started!!");

        String sectionNames[] = {"Choclates" , "Biscuits" , "Toys" , "Grocceries" , "Stationary"};
        String productNames[] = {"Dairy Milk" , "Kit kat" , "Galaxy","Munch" , "5star"};
        String productNames1[] = {"Stuffed doll" , "Barbie doll" , "Remote control car" , "Music box" , "Clay"};

        Section sections[] = new Section[3];

        Section section1 = new Section();
        section1.sectionId =1;
        section1.sections = sectionNames;

        Section section2 = new Section();
        section2.sectionId =2;
        section2.sections = sectionNames;

        Section section3 = new Section();
        section3.sectionId =3;
        section3.sections = sectionNames;

        sections[0] = section1;
        sections[1] = section2;
        sections[2] = section3;


        Product products[] = new Product[2];

        Product product1 = new Product();
        product1.productId = 1;
        product1.sectionName = "Choclates";
        product1.productName = productNames;

        Product product2 = new Product();
        product2.productId = 2;
        product2.sectionName = "Toys";
        product2.productName = productNames1;

        products[0] = product1;
        products[1] = product2;


        Supermarket ref = new Supermarket();
        ref.supermarketId =23;
        ref.supermarketName = "Dmart";
        ref.sections = sections;
        ref.products = products;





        System.out.println("Main Ended!!");

    }
}
