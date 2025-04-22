package com.xworkz.insurance;

import com.xworkz.insurance.constants.PolicyType;
import com.xworkz.insurance.dto.InsurancePolicyDto;
import com.xworkz.insurance.policy.InsurancePolicy;

public class InsurancePolicyRunner {

    public static void main(String[] args) {


        InsurancePolicyDto dto = new InsurancePolicyDto();
        dto.setPolicyHolderName("Akhil Raj");
        dto.setEmail("akhilraj@gmail.com");
        dto.setAddress("4th Main, Koramangala, Bangalore");
        dto.setContactNumber("9876543210");
        dto.setPolicyName("Health Secure Plus");
        dto.setCoverageAmount(500000.00);
        dto.setPremium(6500.00);
        dto.setPolicyType(PolicyType.HEALTH);
        System.out.println(dto);


        InsurancePolicy policy = new InsurancePolicy();
        policy.createPolicy(dto);
        policy.getPolicyDetails();
    }
}
