package com.xworkz.tollapp;

import com.xworkz.tollapp.constants.VehicleType;
import com.xworkz.tollapp.constants.PaymentMode;
import com.xworkz.tollapp.tolldto.TollDto;
import com.xworkz.tollapp.generatetoll.Toll;

public class TollRunner {

    public static void main(String[] args) {



        TollDto dto = new TollDto();
        dto.setVehicleNumber("KA01AB1234");
        dto.setDriverName("Ravi Kumar");
        dto.setVehicleType(VehicleType.TRUCK);
        dto.setTollAmount(150.00);
        dto.setTollBoothLocation("Electronic City Toll Plaza");
        dto.setDate("2025-04-08");
        dto.setPaymentMode(PaymentMode.CARD);
        System.out.println(dto);



        Toll toll = new Toll();
        toll.makePayment(dto);
        toll.getDriverDetails();
    }
}
