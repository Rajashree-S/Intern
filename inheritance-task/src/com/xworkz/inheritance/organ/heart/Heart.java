package com.xworkz.inheritance.organ.heart;

import com.xworkz.inheritance.organ.organdetails.Organ;

public class Heart extends Organ {

    public void organFunction() {
        System.out.println("Pumping Blood");
    }

    public void heartChambers() {
        System.out.println("4 Chambers");
    }

    public void heartBeatRate() {
        System.out.println("72 bpm average");
    }

    public void heartValves() {
        System.out.println("4 Valves");
    }

    public void heartCondition() {
        System.out.println("Condition: Healthy");
    }
}

