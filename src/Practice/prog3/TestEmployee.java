package Practice.prog3;

import Practice.prog2.Emplopyee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Emplopyee b = new Emplopyee("Bob",2001,2,12);

        b.creatNameChecking(300);
        b.creatNameSaving(300);
        b.crateRitermnt(300);
        //System.out.println(b.getFormattedAccountInfo());

        Emplopyee jim = new Emplopyee("Jim Daley",2001,2,12);

        jim.creatNameChecking(10_500.0);
        jim.creatNameSaving(1000.0);
        jim.crateRitermnt(9300.0);

        Emplopyee bob = new Emplopyee("Bob Rebuen",2001,2,12);

        bob.creatNameChecking(34000.0);
        bob.creatNameSaving(27000.0);
        bob.crateRitermnt(0);

        Emplopyee susan = new Emplopyee("Susan Randolph ",2001,2,12);

        susan.creatNameChecking(10_038.0);
        susan.creatNameSaving(12600.0);
        susan.crateRitermnt(9000.0);

        Scanner sc = new Scanner(System.in);
        System.out.print("you want to see report of all account balance? (Yes/No): ");
        String ans = sc.next();
        switch(ans){

            case "yes":
                System.out.println(jim.getFormattedAccountInfo()+"\n");
                System.out.println(bob.getFormattedAccountInfo()+"\n");
                System.out.println(susan.getFormattedAccountInfo()+"\n");
                break;

            case "no":System.out.println("You have a nice day");
            break;
            default:System.out.println("You made a wrong selection: ");
        }

    }
}
