package com.xworkz.gymapp;

import com.xworkz.gymapp.client.Client;
import com.xworkz.gymapp.gym.Gym;
import com.xworkz.gymapp.trainer.Trainer;

public class Runner {

    public static void main(String[] args) {
        String trainersList[] = {"Rahul","Hamith","Yasvanth","Mahith"};
        String clientList[] = {"Gani","Pavan","Ravi","Chinmay"};
        System.out.println("Main started");

        Gym gym[] = new Gym[1];
        Gym ref = new Gym();
        ref.gymName = "Xworkz";
        ref.getGymDetails();


        Client ct[] = new Client[1];
        Client ref1 =new Client();
        ref1.clientId = 5421;
        ref1.clientName = "Dev";
        ref1.clients = clientList;
        ref1.getClientDetails();

        Trainer tr[] = new Trainer[1];
        Trainer ref2 = new Trainer();
        ref2.trainerName= "Shashank";
        ref2.trainerId = 632;
        ref2.trainers = trainersList;
        ref2.getTrainerDetails();


    }
}
