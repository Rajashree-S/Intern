package com.xworkz.bankApp;

import com.xworkz.bankApp.Constants.Account;
import com.xworkz.bankApp.bank.Bank;
import com.xworkz.bankApp.bankdto.BankAccountHolderDto;

public class BankRunner {
    public static void main(String arg[]){

        BankAccountHolderDto bankDto = new BankAccountHolderDto();
        bankDto.setEmail("david@123");
        bankDto.setName("david");
        bankDto.setPhnNo(5638298643l);
        bankDto.setAccountType(Account.savingaccount);
        System.out.println(bankDto);

        Bank bank = new Bank();
        bank.User(bankDto);
        bank.displayAccountHolderDetails();
    }
}
