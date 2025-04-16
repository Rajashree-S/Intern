package com.xworkz.votingapp.generatevote;

import com.xworkz.votingapp.votingdto.VoterDto;

public class Voting {

    VoterDto dto;
    public boolean registerVote(VoterDto dto) {
        boolean voteRegistered = false;
        boolean validated = validateVoter(dto);
        if (validated) {
            voteRegistered = true;
            this.dto =dto;
            System.out.println("Vote registered successfully!");
        } else {
            System.out.println("Voter validation failed!");
        }
        return voteRegistered;
    }

    public boolean validateVoter(VoterDto dto) {
        boolean voterValidated = false;

        boolean nameValid = false;
        boolean idValid = false;
        boolean ageValid = false;
        boolean genderValid = false;
        boolean constituencyValid = false;
        boolean citizenshipValid = false;

        if (dto.getVoterName() != null && !dto.getVoterName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Voter Name!");
        }

        if (dto.getVoterId() != null && !dto.getVoterId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("Invalid Voter ID!");
        }

        if (dto.getAge() >= 18) {
            ageValid = true;
        } else {
            System.out.println("Voter must be at least 18 years old!");
        }

        if (dto.getGender() != null && !dto.getGender().isEmpty()) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!");
        }

        if (dto.getConstituency() != null && !dto.getConstituency().isEmpty()) {
            constituencyValid = true;
        } else {
            System.out.println("Invalid Constituency!");
        }

        if (dto.isIndianCitizen()) {
            citizenshipValid = true;
        } else {
            System.out.println("Only Indian citizens are allowed to vote!");
        }

        if (nameValid && idValid && ageValid && genderValid && constituencyValid && citizenshipValid) {
            voterValidated = true;
        }

        return voterValidated;
    }

    public void displayVoterDetails(){
        System.out.println("----------------------------------");
        System.out.println("Voter Name: " + this.dto.getVoterName());
        System.out.println("Voter ID: " + this.dto.getVoterId());
        System.out.println("Age: " + this.dto.getAge());
        System.out.println("Gender: " + this.dto.getGender());
        System.out.println("Constituency: " + this.dto.getConstituency());
        System.out.println("Indian Citizen: " + this.dto.isIndianCitizen());

        System.out.println("----------------------------------");

    }
}
