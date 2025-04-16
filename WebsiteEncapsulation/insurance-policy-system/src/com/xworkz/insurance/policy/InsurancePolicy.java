package com.xworkz.insurance.policy;

import com.xworkz.insurance.dto.InsurancePolicyDto;

public class InsurancePolicy {
    InsurancePolicyDto dto;
    public boolean createPolicy(InsurancePolicyDto dto) {
        boolean isCreated = false;
        if (validatePolicy(dto)) {
            isCreated = true;
            this.dto = dto;
            System.out.println("Insurance policy created successfully!");
        } else {
            System.out.println("Policy validation failed!");
        }
        return isCreated;
    }

    public boolean validatePolicy(InsurancePolicyDto dto) {


            boolean policyValidated = false;

            boolean nameValid = false;
            boolean emailValid = false;
            boolean addressValid = false;
            boolean contactValid = false;
            boolean policyNameValid = false;
            boolean coverageValid = false;
            boolean premiumValid = false;
            boolean typeValid = false;

            if (dto.getPolicyHolderName() != null && !dto.getPolicyHolderName().isEmpty()) {
                nameValid = true;
            } else {
                System.out.println("Invalid Policy Holder Name!");
            }

            if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
                emailValid = true;
            } else {
                System.out.println("Invalid Email!");
            }

            if (dto.getAddress() != null && !dto.getAddress().isEmpty()) {
                addressValid = true;
            } else {
                System.out.println("Invalid Address!");
            }

            if (dto.getContactNumber() != null && !dto.getContactNumber().isEmpty()) {
                contactValid = true;
            } else {
                System.out.println("Invalid Contact Number!");
            }

            if (dto.getPolicyName() != null && !dto.getPolicyName().isEmpty()) {
                policyNameValid = true;
            } else {
                System.out.println("Invalid Policy Name!");
            }

            if (dto.getCoverageAmount() > 0) {
                coverageValid = true;
            } else {
                System.out.println("Invalid Coverage Amount!");
            }

            if (dto.getPremium() > 0) {
                premiumValid = true;
            } else {
                System.out.println("Invalid Premium!");
            }

            if (dto.getPolicyType() != null) {
                typeValid = true;
            } else {
                System.out.println("Invalid Policy Type!");
            }

        if (nameValid && emailValid && addressValid && contactValid &&
                policyNameValid && coverageValid && premiumValid && typeValid) {
            policyValidated = true;
        }

        return policyValidated;
    }
    public void getPolicyDetails(){
        System.out.println("------------ Policy Details ------------");
        System.out.println("Policy Holder Name: " +  this.dto.getPolicyHolderName());
        System.out.println("Email: " +  this.dto.getEmail());
        System.out.println("Address: " +  this.dto.getAddress());
        System.out.println("Contact Number: " +  this.dto.getContactNumber());
        System.out.println("Policy Name: " +  this.dto.getPolicyName());
        System.out.println("Coverage Amount: " +  this.dto.getCoverageAmount());
        System.out.println("Premium: " +  this.dto.getPremium());
        System.out.println("Policy Type: " +  this.dto.getPolicyType());

        System.out.println("----------------------------------------");

    }
}
