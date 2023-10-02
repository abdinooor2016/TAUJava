package exercises;

import java.util.Scanner;

public class Chapter2MadLibs {

    public static void main(String arg[]) {

        // Ask a user the season of the year
        System.out.println("Enter a season of the year ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Get a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        // Provide an adjective
        System.out.println("Provide ab adjective ");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + "day, I drink a minimum of " + number + "cups coffee");



    }
}
