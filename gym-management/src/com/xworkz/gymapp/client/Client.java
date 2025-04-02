package com.xworkz.gymapp.client;

public class Client {

    public int clientId;
    public String clientName;

    public String clients[];

    public void getClientDetails(){

        System.out.println("CLient id: "+this.clientId);
        System.out.println("Client Name: "+this.clientName);
        System.out.println("The clients list are");
        for(String cs : clients){
            System.out.println(cs);
        }
    }
}
