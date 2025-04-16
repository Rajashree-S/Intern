package com.xworkz.inheritance.organ;

import com.xworkz.inheritance.organ.heart.Heart;
import com.xworkz.inheritance.organ.organdetails.Organ;

public class OrganRunner {
    public static void main(String[] args) {
        Organ organ = new Organ();
        organ.organName();
        organ.organFunction();
        organ.organSystem();
        organ.organLocation();
        organ.organHealthStatus();

        Organ organ1 = new Heart();
        organ1.organFunction();
        organ1.organName();
        organ1.organSystem();
        organ1.organLocation();
        organ1.organHealthStatus();

        Heart heart = new Heart();
        heart.heartChambers();
        heart.heartBeatRate();
        heart.heartValves();
        heart.heartCondition();
        heart.organType();
    }
}

