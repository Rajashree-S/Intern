package com.xworkz.banksystem.customer;

public class Customer {

    public int customerId;
    public String accountType;
    public String customerName[];

    public void getCustomerDetails() {

        System.out.println("------- The Customer details ------");
        System.out.println("The customer id is :" + this.customerId);
        System.out.println("The account type is :" + this.accountType);
        System.out.println("The customer names are ");
        for (String customers : customerName){
            System.out.println(customers);
        }

    }
}