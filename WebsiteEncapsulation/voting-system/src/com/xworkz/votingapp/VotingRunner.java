package com.xworkz.votingapp;

import com.xworkz.votingapp.votingdto.VoterDto;
import com.xworkz.votingapp.generatevote.Voting;

public class VotingRunner {

    public static void main(String[] args) {



        VoterDto dto = new VoterDto();
        dto.setVoterName("Ravi Kumar");
        dto.setVoterId("KA12345678");
        dto.setAge(25);
        dto.setGender("Male");
        dto.setConstituency("Jayanagar");
        dto.setIndianCitizen(true);

        Voting voting = new Voting();
        voting.registerVote(dto);
        voting.displayVoterDetails();
    }
}
