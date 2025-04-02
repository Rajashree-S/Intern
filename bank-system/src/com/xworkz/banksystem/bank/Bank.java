package com.xworkz.banksystem.bank;

import com.xworkz.banksystem.bankaccount.BankAccount;
import com.xworkz.banksystem.customer.Customer;

public class Bank {

    public String bankName;
    public static BankAccount[] bankAccount;
    public static Customer customer[];

    public static void getBankDetails() {
        System.out.println("");
        System.out.println();
        for (BankAccount accounts: bankAccount) {
        accounts.getBankAccountDetails();
        }
        System.out.println();
        for (Customer customers : customer) {
        customers.getCustomerDetails();
        }


    }
}
