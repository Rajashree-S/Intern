package com.xworkz.carcontrolapp.controlcar;

import com.xworkz.carcontrolapp.cardto.CarControlDto;

public class CarControl {

    CarControlDto dto;
    public boolean startControl(CarControlDto dto) {
        boolean controlStarted = false;
        boolean validated = validateCar(dto);
        if (validated) {
            controlStarted = true;
            this.dto = dto;
            System.out.println("Car control started successfully!");
        } else {
            System.out.println("Car validation failed!");
        }
        return controlStarted;
    }

    public boolean validateCar(CarControlDto dto) {

        boolean carValidated = false;

        boolean carModelValid = false;
        boolean licensePlateValid = false;
        boolean ownerNameValid = false;
        boolean contactNumberValid = false;
        boolean engineStatusValid = false;
        boolean fuelLevelValid = false;
        boolean speedValid = false;
        boolean controlModeValid = false;

        if (dto.getCarModel() != null && !dto.getCarModel().isEmpty()) {
            carModelValid = true;
        } else {
            System.out.println("Invalid Car Model!!!!");
        }

        if (dto.getLicensePlate() != null && !dto.getLicensePlate().isEmpty()) {
            licensePlateValid = true;
        } else {
            System.out.println("Invalid License Plate!!!!");
        }

        if (dto.getOwnerName() != null && !dto.getOwnerName().isEmpty()) {
            ownerNameValid = true;
        } else {
            System.out.println("Invalid Owner Name!!!!");
        }

        if (dto.getContactNumber() != null && !dto.getContactNumber().isEmpty()) {
            contactNumberValid = true;
        } else {
            System.out.println("Invalid Contact Number!!!!");
        }

        if (dto.isEngineStatus() != false ){
            engineStatusValid = true;
        }else{
            System.out.println("Invalid engineer status");
        } // assuming engineStatus is boolean, it's always valid

        if (dto.getFuelLevel() >= 0) {
            fuelLevelValid = true;
        } else {
            System.out.println("Invalid Fuel Level!!!!");
        }

        if (dto.getSpeed() >= 0) {
            speedValid = true;
        } else {
            System.out.println("Invalid Speed!!!!");
        }

        if (dto.getControlMode() != null) {
            controlModeValid = true;
        } else {
            System.out.println("Invalid Control Mode!!!!");
        }

        if (carModelValid && licensePlateValid && ownerNameValid && contactNumberValid &&
                engineStatusValid && fuelLevelValid && speedValid && controlModeValid) {
            carValidated = true;
        }

        return carValidated;
    }

    public void getCarControlDetails(){
        System.out.println("Car Model: " + this.dto.getCarModel());
        System.out.println("License Plate: " + this.dto.getLicensePlate());
        System.out.println("Owner: " + this.dto.getOwnerName());
        System.out.println("Contact: " + this.dto.getContactNumber());
        System.out.println("Engine Status: " + this.dto.isEngineStatus());
        System.out.println("Fuel Level: " + this.dto.getFuelLevel());
        System.out.println("Speed: " + this.dto.getSpeed());
        System.out.println("Control Mode: " + this.dto.getControlMode());

        System.out.println("----------------------------------");
    }

}
