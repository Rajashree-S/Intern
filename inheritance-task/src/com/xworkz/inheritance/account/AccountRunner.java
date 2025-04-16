package com.xworkz.inheritance.account;

public class AccountRunner {
    public static void main(String[] args) {

        Account base = new Account();
        base.accountBalance();
        base.accountHolder();
        base.accountNumber();
        base.accountStatus();
        base.accountType();

        Account base1 = new SavingsAccount();
        base.accountBalance();
        base.accountHolder();
        base.accountNumber();
        base.accountStatus();
        base.accountType();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountOpenedDate();
        savingsAccount.interestRate();
        savingsAccount.minimumBalance();
        savingsAccount.savingsAccountNumber();
        savingsAccount.savingsAccountHolder();


    }
}
