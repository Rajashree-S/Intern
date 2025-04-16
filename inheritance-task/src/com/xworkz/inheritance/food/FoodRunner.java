package com.xworkz.inheritance.food;

import com.xworkz.inheritance.food.fooddetails.Food;
import com.xworkz.inheritance.food.pizza.Pizza;

import java.nio.channels.Pipe;

public class FoodRunner {

        public static void main(String[] args) {
            Food food = new Food();
            food.foodName();
            food.foodType();
            food.foodOrigin();
            food.foodIngredients();
            food.foodCalories();

            Food food1 = new Pizza();
            food1.foodName();
            food1.foodType();
            food1.foodOrigin();
            food1.foodIngredients();
            food1.foodCalories();

            Pizza pizza = new Pizza();
            pizza.pizzaSize();
            pizza.pizzaCrust();
            pizza.pizzaToppings();
            pizza.pizzaCheeseType();
            pizza.pizzaPrice();
        }
    }


