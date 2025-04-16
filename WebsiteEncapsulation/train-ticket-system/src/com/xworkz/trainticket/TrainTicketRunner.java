package com.xworkz.trainticket;

import com.xworkz.trainticket.constants.TicketClass;
import com.xworkz.trainticket.ticketdto.TrainTicketDto;
import com.xworkz.trainticket.servicetrain.TrainTicketService;

public class TrainTicketRunner {

    public static void main(String[] args) {

        TrainTicketDto dto = new TrainTicketDto();
        dto.setPassengerName("Ravi Kumar");
        dto.setDepartureStation("Bangalore");
        dto.setArrivalStation("Hyderabad");
        dto.setJourneyDate("12/04/2025");
        dto.setTicketClass(TicketClass.AC);
        dto.setNumberOfPassengers(2);
        dto.setContactNumber("9876543210");
        dto.setEmail("ravi.kumar@example.com");



        TrainTicketService service = new TrainTicketService();
        service.bookTicket(dto);
        service.getPassengerDetails();
    }
}
