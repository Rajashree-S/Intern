package com.xworkz.trainticket.servicetrain;

import com.xworkz.trainticket.ticketdto.TrainTicketDto;

public class TrainTicketService {

    TrainTicketDto dto;
    public boolean bookTicket(TrainTicketDto dto) {
        boolean isTicketValid = false;
        boolean isValid = validateTicket(dto);
        if (isValid == true) {
            isTicketValid = true;
            this.dto = dto;
            System.out.println("Ticket booked successfully!");
            return true;
        } else {
            System.out.println("Ticket booking failed due to invalid data.");
            return false;
        }
    }

    private boolean validateTicket(TrainTicketDto dto) {
        boolean passengerValid = dto.getPassengerName() != null && !dto.getPassengerName().isEmpty();
        boolean departureValid = dto.getDepartureStation() != null && !dto.getDepartureStation().isEmpty();
        boolean arrivalValid = dto.getArrivalStation() != null && !dto.getArrivalStation().isEmpty();
        boolean dateValid = dto.getJourneyDate() != null && !dto.getJourneyDate().isEmpty();
        boolean classValid = dto.getTicketClass() != null;
        boolean countValid = dto.getNumberOfPassengers() > 0;
        boolean contactValid = dto.getContactNumber() != null && !dto.getContactNumber().isEmpty();
        boolean emailValid = dto.getEmail() != null && !dto.getEmail().isEmpty();

        if (!passengerValid)
            System.out.println("Invalid Passenger Name!");
        if (!departureValid)
            System.out.println("Invalid Departure Station!");
        if (!arrivalValid)
            System.out.println("Invalid Arrival Station!");
        if (!dateValid)
            System.out.println("Invalid Journey Date!");
        if (!classValid)
            System.out.println("Invalid Ticket Class!");
        if (!countValid)
            System.out.println("Invalid Number of Passengers!");
        if (!contactValid)
            System.out.println("Invalid Contact Number!");
        if (!emailValid)
            System.out.println("Invalid Email!");

        return passengerValid && departureValid && arrivalValid && dateValid &&
                classValid && countValid && contactValid && emailValid;
    }

    public void getPassengerDetails(){
        System.out.println("----- Passenger Ticket Info -----");
        System.out.println("Name: " + this.dto.getPassengerName());
        System.out.println("From: " + this.dto.getDepartureStation());
        System.out.println("To: " + this.dto.getArrivalStation());
        System.out.println("Date: " + this.dto.getJourneyDate());
        System.out.println("Class: " + this.dto.getTicketClass());
        System.out.println("No. of Passengers: " + this.dto.getNumberOfPassengers());
        System.out.println("Contact: " + this.dto.getContactNumber());
        System.out.println("Email: " + this.dto.getEmail());

        System.out.println("----------------------------------");
    }
}
