package com.xworkz.banksystem;

import com.xworkz.banksystem.bank.Bank;
import com.xworkz.banksystem.bankaccount.BankAccount;
import com.xworkz.banksystem.customer.Customer;

public class BankRunner {

    public static void main(String[] args) {

        System.out.println("Main Started!!");

        String accountHolderName[] = {"rio" , "Jack"};
        String  customerNames[] = {"Manoj" , "charlie"};

        BankAccount account[] = new BankAccount[1];

        BankAccount account1 = new BankAccount();
        account1.accountId = 2;
        account1.accountType = "Savings account";
        account1.accountHolderName  = accountHolderName;

        account[0] = account1;


        Customer custom[] = new Customer[1];

        Customer custom1 = new Customer();
        custom1.customerId = 34;
        custom1.accountType = "Savings Account";
        custom1.customerName = customerNames;

        custom[0] = custom1;

        Bank ref = new Bank();
        ref.bankName = "Indian Bank";
        ref.bankAccount = account;
        ref.customer = custom;

        ref.getBankDetails();


        System.out.println("Main Ended!!");
    }
}
