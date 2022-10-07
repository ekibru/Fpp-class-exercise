package Practice.prog1;

import Practice.prog2.AccountType;
import Practice.prog2.Emplopyee;

public class Account {
    private double balance;
    private AccountType accountType;

    private Emplopyee emplopyee;

    public Account(double balance, AccountType accountType, Emplopyee emplopyee) {
        this.balance = balance;
        this.accountType = accountType;
        this.emplopyee = emplopyee;
    }

    public Account(AccountType accountType, Emplopyee emplopyee) {
        this.accountType = accountType;
        this.emplopyee = emplopyee;
    }

    public double getBalance() {
        return balance;
    }



    public void makeDeposit(double amount){

    }
    public boolean makeWithdrawal(double amount){


        return true;
    }
}
