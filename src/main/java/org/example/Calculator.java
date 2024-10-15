package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        Services ser = new Services();

        System.out.println("Calculator: ");

        while(true)
        {
            System.out.println("#------------------------------------------------------#");
            System.out.println("Select an option:");
            System.out.println("1) Square root of a decimal number");
            System.out.println("2) Factorial of an integer");
            System.out.println("3) Natural logarithm of a real number (positive)");
            System.out.println("4) Power of a number");
            System.out.println("5) Exit");

            int choice = inputclass.in.nextInt();
            if(choice == 1){
                System.out.println("Enter Positive Real Number for Square Root");
                Double d = inputclass.in.nextDouble();
                System.out.println(ser.sqrt(d));
            }
            else if (choice == 2)
            {
                System.out.println("Enter a number to calculate its factorial:");
                Integer n = inputclass.in.nextInt();
                System.out.println(ser.factorial(n));
            }
            else if (choice == 3)
            {
                System.out.println("Enter Positive Real Number for Logarithm");
                Double d = inputclass.in.nextDouble();
                System.out.println(ser.logarithm(d));
            }
            else if (choice == 4)
            {
                System.out.println("Enter Base and Exponent");
                Double base = inputclass.in.nextDouble();
                Double exp = inputclass.in.nextDouble();
                System.out.println(ser.power(base, exp));
            }
            else if (choice == 5)
            {
                System.out.println("Exiting -------------------");
                break;
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }
    }
}

class inputclass
{
    public static Scanner in = new Scanner(System.in);
}
