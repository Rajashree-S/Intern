package com.xworkz.typesofinheritance.hierarchicalinheritance;

public class OnlinePaymentRunner {
    public static void main(String[] args) {

        System.out.println("-----------Online Payment details--------");
        OnlinePayment payment = new OnlinePayment();
        payment.productId();
        payment.productName();
        payment.productPrice();
        payment.coupons();
        payment.orderNo();
        payment.productQuantity();
        payment.productRatings();
        payment.deliveryDate();

        System.out.println("-----------Credit Card details--------");
        CreditCard card = new CreditCard();
        card.cardNo();
        card.cardHolderName();
        card.cardType();
        card.CVV();
        card.validThru();
        card.finalPrice();
        card.paymentTime();
        card.cancelPayment();

        System.out.println("-----------Debit Card details--------");
        DebitCard card1 = new DebitCard();
        card1.cardNo();
        card1.cardHolderName();
        card1.cardType();
        card1.CVV();
        card1.validThru();
        card1.finalPrice();
        card1.paymentTime();
        card1.cancelPayment();

    }
}
