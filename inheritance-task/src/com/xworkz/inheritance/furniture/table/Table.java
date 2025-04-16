package com.xworkz.inheritance.furniture.table;

import com.xworkz.inheritance.furniture.furnituredetails.Furniture;

public class Table extends Furniture {
    public void tableShape() {
        System.out.println("The table shape");
    }

    public void tableLegs() {
        System.out.println("The number of table legs");
    }

    public void tableHeight() {
        System.out.println("The table height");
    }

    public void tableUsage() {
        System.out.println("The usage of the table");
    }

    public void tableFoldable() {
        System.out.println("Is the table foldable?");
    }
}
