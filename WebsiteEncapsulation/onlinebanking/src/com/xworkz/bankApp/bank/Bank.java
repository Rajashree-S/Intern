package com.xworkz.bankApp.bank;

import com.xworkz.bankApp.bankdto.BankAccountHolderDto;

public class Bank {

    BankAccountHolderDto bankDto;
    public  boolean User(BankAccountHolderDto bankDto){
        boolean isUserRegisterd = false;
        boolean uservalid = validateUser(bankDto);
        if(uservalid == true ) {
            isUserRegisterd = true;
            this.bankDto = bankDto;
            System.out.println("User registered!!!!");
        }else{
            System.out.println("not registered");
        }
        return  isUserRegisterd;
    }

    public boolean validateUser(BankAccountHolderDto bankDto){
        boolean isUserValidated = false;
        boolean isName = false;
        boolean isEmail = false;
        boolean isPhnNo = false;
        boolean isAccountType = false;

        if(bankDto.getEmail()!=null){
            isEmail = true;
        }
        if(bankDto.getName()!=null){
            isName = true;
        }
        if(bankDto.getPhnNo()!=0){
            isPhnNo = true;
        }
        if(bankDto.getAccountType()!=null){
            isAccountType = true;
        }
        if(isEmail == true && isName == true && isPhnNo == true && isAccountType == true)
            isUserValidated = true;
        else
            System.out.println("try again");
        return isUserValidated;
    }

    public void displayAccountHolderDetails(){
        System.out.println("----------------------------------");

        System.out.println("Email id :"+this.bankDto.getEmail());
        System.out.println("User Name:"+this.bankDto.getName());
        System.out.println("payment type :"+this.bankDto.getPhnNo());
        System.out.println("course type :"+this.bankDto.getAccountType());

        System.out.println("----------------------------------");

    }
}
