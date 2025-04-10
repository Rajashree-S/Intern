package com.xworkz.inheritance.employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee base = new Employee();
        base.name = "Employee Example";
        base.type = "General";
        base.display();
        base.get();

        Engineer sub = new Engineer();
        sub.name = "Engineer Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
