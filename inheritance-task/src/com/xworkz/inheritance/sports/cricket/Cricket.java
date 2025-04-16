package com.xworkz.inheritance.sports.cricket;

import com.xworkz.inheritance.sports.sportsdetails.Sports;

public class Cricket extends Sports {


        public void cricketFormat() {
            System.out.println("Formats: Test, ODI, T20");
        }

        public void cricketEquipment() {
            System.out.println("Equipment: Bat, Ball, Stumps, Pads, Helmet");
        }

        public void cricketTeamSize() {
            System.out.println("Each team has 11 players");
        }

        public void cricketField() {
            System.out.println("Played on a large oval field");
        }

        public void cricketUmpires() {
            System.out.println("Two on-field umpires, one third umpire");
        }
    }



