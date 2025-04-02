package com.xworkz.gymapp.trainer;

public class Trainer {

    public int trainerId;
    public String trainerName;

    public String trainers[];

    public void getTrainerDetails(){

        System.out.println("Id of the trainer: "+this.trainerId);
        System.out.println("Name of the trainer: "+this.trainerName);
        System.out.println("The list of trainers are:");
        for(String tr : trainers){
            System.out.println(tr);
        }
    }
}
