package com.xworkz.tollapp.generatetoll;

import com.xworkz.tollapp.tolldto.TollDto;

public class Toll {

    TollDto dto;
    public boolean makePayment(TollDto dto) {
        boolean paymentDone = false;
        boolean validated = validatePayment(dto);
        if (validated) {
            paymentDone = true;
            this.dto = dto;
            System.out.println("Toll payment successful!");
        } else {
            System.out.println("Toll payment failed due to validation errors.");
        }
        return paymentDone;
    }

    public boolean validatePayment(TollDto dto) {
        boolean paymentValidated = false;

        boolean vehicleNumberValid = false;
        boolean driverNameValid = false;
        boolean vehicleTypeValid = false;
        boolean tollAmountValid = false;
        boolean tollBoothValid = false;
        boolean dateValid = false;
        boolean paymentModeValid = false;

        if (dto.getVehicleNumber() != null && !dto.getVehicleNumber().isEmpty()) {
            vehicleNumberValid = true;
        } else {
            System.out.println("Invalid Vehicle Number!");
        }

        if (dto.getDriverName() != null && !dto.getDriverName().isEmpty()) {
            driverNameValid = true;
        } else {
            System.out.println("Invalid Driver Name!");
        }

        if (dto.getVehicleType() != null) {
            vehicleTypeValid = true;
        } else {
            System.out.println("Invalid Vehicle Type!");
        }

        if (dto.getTollAmount() > 0) {
            tollAmountValid = true;
        } else {
            System.out.println("Invalid Toll Amount!");
        }

        if (dto.getTollBoothLocation() != null && !dto.getTollBoothLocation().isEmpty()) {
            tollBoothValid = true;
        } else {
            System.out.println("Invalid Toll Booth Location!");
        }

        if (dto.getDate() != null && !dto.getDate().isEmpty()) {
            dateValid = true;
        } else {
            System.out.println("Invalid Date!");
        }

        if (dto.getPaymentMode() != null) {
            paymentModeValid = true;
        } else {
            System.out.println("Invalid Payment Mode!");
        }

        if (vehicleNumberValid && driverNameValid && vehicleTypeValid && tollAmountValid &&
                tollBoothValid && dateValid && paymentModeValid) {
            paymentValidated = true;
        }

        return paymentValidated;
    }

    public void getDriverDetails(){
        System.out.println("----------------------------------");
        System.out.println("Vehicle Number: " + this.dto.getVehicleNumber());
        System.out.println("Driver Name: " + this.dto.getDriverName());
        System.out.println("Vehicle Type: " + this.dto.getVehicleType());
        System.out.println("Toll Amount: " + this.dto.getTollAmount());
        System.out.println("Toll Booth: " + this.dto.getTollBoothLocation());
        System.out.println("Date: " + this.dto.getDate());
        System.out.println("Payment Mode: " + this.dto.getPaymentMode());

        System.out.println("----------------------------------");
    }
}
