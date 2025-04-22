package com.xworkz.trainticket.ticketdto;

import com.xworkz.trainticket.constants.TicketClass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainTicketDto {

    private String passengerName;
    private String departureStation;
    private String arrivalStation;
    private String journeyDate;
    private TicketClass ticketClass;
    private int numberOfPassengers;
    private String contactNumber;
    private String email;

    public String toString(){
        return "TrainTicketDto : (passengerName : "+this.passengerName+
                " , departureStation : " + this.departureStation +
                " , arrivalStation : " + this.arrivalStation+
                " , contactNumber : " +this.contactNumber+
                " , journeyDate : " +this.journeyDate+
                " , ticketClass : " +this.ticketClass+
                " , numberOfPassengers : " +this.numberOfPassengers+
                " , email : " +this.email+ ") ";
    }


    /*public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }*/
}
