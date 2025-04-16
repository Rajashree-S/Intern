package com.xworkz.inheritance.employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Engineer();
        employee.employeeDepartment();
        employee.employeeId();
        employee.employeeName();
        employee.employeeSalary();
        employee.employeeJoiningDate();

        Employee employee1 = new Engineer();
        employee1.employeeDepartment();
        employee1.employeeId();
        employee1.employeeName();
        employee1.employeeSalary();
        employee1.employeeJoiningDate();

        Engineer engineer = new Engineer();
        engineer.engineerExperience();
        engineer.engineerProject();
        engineer.engineerId();
        engineer.engineerSpecialization();
        engineer.engineerTeamSize();


    }
}
