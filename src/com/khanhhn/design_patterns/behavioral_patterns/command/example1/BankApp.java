package com.khanhhn.design_patterns.behavioral_patterns.command.example1;

public class BankApp {

    private Command openAccount;
    private Command closeAccount;

    public BankApp(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public void clickOpenAccount() {
        System.out.println("User click open an account");
        openAccount.execute();
    }

    public void clickCloseAccount() {
        System.out.println("User click an account");
        closeAccount.execute();
    }
}
