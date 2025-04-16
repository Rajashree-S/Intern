package com.xworkz.inheritance.sports;

import com.xworkz.inheritance.sports.cricket.Cricket;
import com.xworkz.inheritance.sports.sportsdetails.Sports;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sport = new Sports();
        sport.sportName();
        sport.sportType();
        sport.sportOrigin();
        sport.sportRules();
        sport.sportPlayers();

        Sports sport1 = new Cricket();
        sport1.sportFunction();
        sport1.sportName();
        sport1.sportType();
        sport1.sportOrigin();
        sport1.sportRules();

        Cricket cricket = new Cricket();
        cricket.cricketFormat();
        cricket.cricketEquipment();
        cricket.cricketTeamSize();
        cricket.cricketField();
        cricket.cricketUmpires();
    }
}
