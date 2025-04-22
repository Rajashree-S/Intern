package com.xworkz.carcontrolapp;

import com.xworkz.carcontrolapp.constants.ControlMode;
import com.xworkz.carcontrolapp.cardto.CarControlDto;
import com.xworkz.carcontrolapp.controlcar.CarControl;

public class CarControlRunner {

    public static void main(String[] args) {


        CarControlDto dto = new CarControlDto();
        dto.setCarModel("Tesla Model S");
        dto.setLicensePlate("KA-05-1234");
        dto.setOwnerName("Akhil Raj");
        dto.setContactNumber("9876543210");
        dto.setEngineStatus(true);
        dto.setFuelLevel(85.5);
        dto.setSpeed(60.0);
        dto.setControlMode(ControlMode.AUTOMATIC);
        System.out.println(dto);




      /*  CarControl control = new CarControl();
        control.startControl(dto);
        control.getCarControlDetails();*/


    }
}
