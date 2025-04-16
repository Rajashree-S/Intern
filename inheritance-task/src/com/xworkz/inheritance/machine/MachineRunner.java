package com.xworkz.inheritance.machine;

public class MachineRunner {
    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.machineName();
        machine.machineId();
        machine.machineType();
        machine.machineManufacturer();
        machine.machineYear();

        Machine machine1 = new Lathe();
        machine1.machineFunction();
        machine1.machineName();
        machine1.machineId();
        machine1.machineType();
        machine1.machineManufacturer();

        Lathe lathe = new Lathe();
        lathe.latheModel();
        lathe.latheSpeed();
        lathe.latheUsage();
        lathe.latheToolType();
        lathe.latheSize();

    }
}
