package Practice.prog2;

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
        balance=balance+amount;
    }
    public boolean makeWithdrawal(double amount){

        if(balance<amount)
           return false;
        balance= balance-amount;
        return true;
    }
    @Override
    public String toString() {
        return   "accountType=" + accountType+"\nCurrent Balance: "+balance;
    }

}
