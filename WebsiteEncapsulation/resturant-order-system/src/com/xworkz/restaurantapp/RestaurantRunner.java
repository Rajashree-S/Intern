package com.xworkz.restaurantapp;

import com.xworkz.restaurantapp.constants.PaymentMethod;
import com.xworkz.restaurantapp.restaurantdto.RestaurantOrderDto;
import com.xworkz.restaurantapp.orderprocessing.Restaurant;

public class RestaurantRunner {

    public static void main(String[] args) {


        RestaurantOrderDto dto = new RestaurantOrderDto();
        dto.setCustomerName("Samantha Rao");
        dto.setTableNumber(7);
        dto.setDishName("Paneer Butter Masala");
        dto.setServings(2);
        dto.setTotalAmount(550.00);
        dto.setContactNumber("9876543210");
        dto.setPaymentMethod(PaymentMethod.CARD);



        Restaurant restaurant = new Restaurant();
        restaurant.placeOrder(dto);
        restaurant.displayRestaurantOrder();
    }
}
