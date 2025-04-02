package com.xworkz.banksystem.bankaccount;

public class BankAccount {

    public int accountId;
    public String accountType;
    public String accountHolderName[];

    public void getBankAccountDetails() {

        System.out.println("------- The Bank Account details ------");
        System.out.println("The account id is :" + this.accountId);
        System.out.println("The Account type is :" + this.accountType);
        System.out.println("The Account holder names are ");
        for (String name : accountHolderName) {
            System.out.println(name);
        }
    }
}
