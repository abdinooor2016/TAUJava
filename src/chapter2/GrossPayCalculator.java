package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    //This is default method in Java
    public static void main(String arg[]) {

       // 1. Get the number of hours worked
        System.out.println("Enter numbers hours employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

       // 2. Get the hourly pay rate
        System.out.println("Entre the employee's pay rate");
        double rates = scanner.nextDouble();
        scanner.close();

        // 3. Multiply hourss and pay rate
        double grossPay = hours * rates;

       // 4. Display result
        System.out.println("The employee's gross pay is £"  + grossPay);
    }
}
