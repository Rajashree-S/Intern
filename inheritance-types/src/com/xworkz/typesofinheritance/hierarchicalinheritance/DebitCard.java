package com.xworkz.typesofinheritance.hierarchicalinheritance;

public class DebitCard extends OnlinePayment{
    public void cardHolderName(){
        System.out.println("Rio");
    }
    public  void cardType(){
        System.out.println("debit card");
    }
    public void cardNo(){
        System.out.println("55555");
    }
    public void validThru(){
        System.out.println("66666");
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
