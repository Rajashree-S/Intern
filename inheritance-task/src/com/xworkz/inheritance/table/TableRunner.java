package com.xworkz.inheritance.table;

public class TableRunner {
    public static void main(String[] args) {
        Wood wood = new Wood();
        wood.woodType();
        wood.woodOrigin();
        wood.woodColor();
        wood.woodHardness();
        wood.woodGrain();

        Wood wood1 = new Table();
        wood1.woodFunction();
        wood1.woodType();
        wood1.woodOrigin();
        wood1.woodColor();
        wood1.woodHardness();

        Table table = new Table();
        table.tableShape();
        table.tableSize();
        table.tableUse();
        table.tableStyle();
        table.tableLegs();
    }
}
