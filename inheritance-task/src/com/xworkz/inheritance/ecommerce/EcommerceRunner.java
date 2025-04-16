package com.xworkz.inheritance.ecommerce;

import com.xworkz.inheritance.ecommerce.ecomm.Ecommerece;
import com.xworkz.inheritance.ecommerce.flipkart.Flipkart;

public class EcommerceRunner {
    public static void main(String[] args) {

        Ecommerece ecommerece = new Ecommerece();
        ecommerece.ecommerceCategory();
        ecommerece.ecommerceFounder();
        ecommerece.ecommercePlatformName();
        ecommerece.ecommerceServices();
        ecommerece.ecommerceUserCount();

        Ecommerece ecommerece1 = new Flipkart();
        ecommerece1.ecommerceCategory();
        ecommerece1.ecommerceFounder();
        ecommerece1.ecommercePlatformName();
        ecommerece1.ecommerceServices();
        ecommerece1.ecommerceUserCount();

        Flipkart flipkart = new Flipkart();
        flipkart.flipkartCustomerSupport();
        flipkart.flipkartDeliveryOptions();
        flipkart.flipkartSellers();
        flipkart.flipkartPaymentModes();
        flipkart.flipkartReturnPolicy();

    }
}
