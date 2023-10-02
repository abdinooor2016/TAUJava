package chapter3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

    public static void main(String args[]) {

        //Initialize what we know
        int requireSalary = 30000;
        int requireYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requireSalary){
            if(years >= requireYearsEmployed) {
                System.out.println("Congrats! You have qualify for the loan");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                        + requireYearsEmployed + "years ");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $"
                    + requireSalary + " to qualify for the loan ");
        }
    }
}
