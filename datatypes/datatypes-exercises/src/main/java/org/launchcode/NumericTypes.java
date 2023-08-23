package org.launchcode;
/*Add an import statement*/
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");

        int length = scan.nextInt();

        System.out.println("Enter width of rectangle: ");

        int width = scan.nextInt();

        int rectangleArea =  length * width;

        System.out.println("The area of the rectangle is: " + rectangleArea);

    }
}
