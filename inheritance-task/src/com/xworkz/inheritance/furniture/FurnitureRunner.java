package com.xworkz.inheritance.furniture;

import com.xworkz.inheritance.furniture.furnituredetails.Furniture;
import com.xworkz.inheritance.furniture.table.Table;

public class FurnitureRunner {


        public static void main(String[] args) {
            Furniture furniture = new Furniture();
            furniture.furnitureType();
            furniture.furnitureMaterial();
            furniture.furnitureColor();
            furniture.furnitureWeight();
            furniture.furniturePrice();

            Furniture furniture1 = new Table();
            furniture1.furnitureType();
            furniture1.furnitureMaterial();
            furniture1.furnitureColor();
            furniture1.furnitureWeight();
            furniture1.furniturePrice();

            Table table = new Table();
            table.tableShape();
            table.tableLegs();
            table.tableHeight();
            table.tableUsage();
            table.tableFoldable();
        }
    }


