package com.xworkz.supermarket.product;

public class Product {

    public int productId;
    public String sectionName;
    public String productName[];

    public void getProductDetails(){

        System.out.println("------- The product details ------");
        System.out.println("The product id is :"+this.productId);
        System.out.println("The product name is :"+this.sectionName);
        System.out.println("The product names are ");
        for (String products : productName){
            System.out.println(products);
        }

    }

}
