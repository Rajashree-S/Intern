package com.xworkz.restaurantapp.restaurantdto;

import com.xworkz.restaurantapp.constants.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantOrderDto {

    private String customerName;
    private int tableNumber;
    private String dishName;
    private int servings;
    private double totalAmount;
    private String contactNumber;
    private PaymentMethod paymentMethod;

    public String toString(){
        return "RestaurantOrderDto : (customerName : "+this.customerName+
                " , tableNumber : " + this.tableNumber +
                " , dishName : " + this.dishName+
                " , contactNumber : " +this.contactNumber+
                " , servings : " +this.servings+
                " , totalAmount : " +this.totalAmount+
                " , paymentMethod : " +this.paymentMethod+ ") ";
    }


   /* public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getServings() {
        return servings;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }*/
}

