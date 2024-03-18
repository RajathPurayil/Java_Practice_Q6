import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Write a program that reads a Celsius degree in
        a double value from the console, then converts it to Fahrenheit and displays the
        result. The formula for the conversion is as follows:
        fahrenheit = (9 / 5) * celsius + 32*/

        // Create new Scanner object

        Scanner sc = new Scanner(System.in);
        // Prompt user to input a double
        System.out.println("Enter the Celsius  value");
        Double Celsius=sc.nextDouble();
        // Display results
        System.out.println( "Fahrenheit Value"+(9 / 5) * Celsius + 32);



    }
}