package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        /*Ask a question to ask the user*/
        System.out.println("Enter a radius: ");
        /*Create a variable to store the user’s response*/
        double num1 = scan.nextDouble();

        scan.close();

        double product = 3.14 * num1 * num1;
        /*Use concatenation to print the greeting*/
        System.out.println("The area of a circle of radius " + num1 + " is: " + product);
    }

}
