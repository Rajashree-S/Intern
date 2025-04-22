package com.xworkz.flipkartapp.flipkartdto;

import com.xworkz.flipkartapp.constants.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlipkartCustomerDto {

    private String customerName;
    private String email;
    private String address;
    private String contactNumber;
    private String productName;
    private int quantity;
    private double price;
    private PaymentMethod paymentMethod;

    public String toString(){
        return "FlipkartCustomerDto : (customerName : "+this.customerName+
                " , email : " + this.email +
                " , address : " + this.address+
                " , contactNumber : " +this.contactNumber+
                " , productName : " +this.productName+
                " , quantity : " +this.quantity+
                " , price : " +this.price+
                " , paymentMethod : " +this.paymentMethod+ ") ";
    }


    /*public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }*/
}
