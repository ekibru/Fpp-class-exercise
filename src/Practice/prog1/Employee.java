package Practice.prog1;

import Practice.prog2.Account;
import Practice.prog2.AccountType;

import java.time.LocalDate;

public class Employee {
    private String name;
    private Account saving;
    private Account checking;
    private Account ritermnt;
    private LocalDate hireDate;

    public Employee(String name, int year,int month,int day) {
        this.name = name;
        this.hireDate = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {

        return hireDate;
    }
    public String getFormattedAccountInfo(){


        return "Account Info for: "+name+"\n"+"\n"+checking+"\n"+
                saving+"\n"+
                ritermnt;
    }
    public void makeDeposit(AccountType type, double amount){

    }
    public boolean makeWithdrawal(AccountType type,double amount){


        return true;
    }
    public void creatNameSaving(double startingBalnce){


    }
    public void creatNameChecking(double startingBalnce){



    }
    public void crateRitermnt(double startingBalnce){


    }

}
