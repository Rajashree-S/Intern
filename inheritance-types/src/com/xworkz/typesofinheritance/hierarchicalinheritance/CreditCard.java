package com.xworkz.typesofinheritance.hierarchicalinheritance;

public class CreditCard extends OnlinePayment{

    public void cardHolderName(){
        System.out.println("Rio");
    }
    public  void cardType(){
        System.out.println("credit card");
    }
    public void cardNo(){
        System.out.println("567890");
    }
    public void validThru(){
        System.out.println("1234");
    }
    public void CVV(){
        System.out.println("CVV no");
    }
    public void finalPrice(){
        System.out.println("600");
    }
    public void paymentTime(){
        System.out.println("12:10");
    }
    public void cancelPayment(){
        System.out.println("cancel payment");
    }

}
