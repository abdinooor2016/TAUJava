package exercises;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int pound = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Pound'! " +
                "Your goal is to enter enough change to make exactly £1.00");

        System.out.println("Enter number of  pennies? ");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter number of nickles? ");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter number of dimes? ");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter number of quarters ");
        int numberOfQuarters = scanner.nextInt();

        double total = numberOfPennies * penny + numberOfNickels * nickel + numberOfDimes * dime +
                numberOfQuarters * quarter;

        if(total < pound) {
            double amountShort = pound - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents");
        }
        else if(total > pound) {
            double amountOver = total -pound;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You are over " + String.format("%.2f", amountOver) + " cents");
        }
        else{
            System.out.println("Yay! That's exactly £1.00! You win");
        }
    }
}
