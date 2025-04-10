package com.xworkz.inheritance.food;

import com.xworkz.inheritance.food.pizza.Pizza;

import java.nio.channels.Pipe;

public class FoodRunner {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.displayFood();
    }
}
