package com.xworkz.gymapp.gym;

import com.xworkz.gymapp.client.Client;
import com.xworkz.gymapp.trainer.Trainer;

public class Gym {

    public String gymName;

    public Client client[];

    public Trainer trainer[];

    public void getGymDetails(){

        System.out.println("The name of the gym is:" +this.gymName);
    }
}
