package com.xworkz.inheritance.account;

public class AccountRunner {
    public static void main(String[] args) {
        Account base = new Account();
        base.name = "Account Example";
        base.type = "General";
        base.display();
        base.get();

        SavingsAccount sub = new SavingsAccount();
        sub.name = "SavingsAccount Example";
        sub.type = "Specific";
        sub.display();
        sub.get();
    }
}
