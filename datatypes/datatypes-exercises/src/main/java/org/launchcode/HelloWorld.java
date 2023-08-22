package org.launchcode;
/*Add an import statement*/
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        /*Declare a variable*/
        Scanner input = new Scanner(System.in);
        /*Ask a question to ask the user*/
        System.out.println("Hello, what is your name:");
        /*Create a variable to store the user’s response*/
        String name = input.nextLine();
        /*Use concatenation to print the greeting*/
        System.out.println("Hello " + name);
    }
}