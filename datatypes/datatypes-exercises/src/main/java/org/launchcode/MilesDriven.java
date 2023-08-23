package org.launchcode;
/*Add an import statement*/
import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of miles driven: ");

        double miles = scan.nextDouble();

        System.out.println("Enter number of gallons to refill: ");

        double gas = scan.nextDouble();

        double milesPerGallon =  miles / gas;

        System.out.println("Your vehicle is getting " + milesPerGallon + " mpg");

    }
}
