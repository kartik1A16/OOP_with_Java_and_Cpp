/*Handling Runtime Errors in Java 
Objective: To handle multiple exceptions and demonstrate try, 
 catch, finally, and throw. 
Problem Statement: Write a program to perform division of two
 numbers. Handle exceptions for:
 1. Division by zero (ArithmeticException)
 2. Invalid input (InputMismatchException) Demonstrate the use 
 of multiple catch blocks and a finally block.
Concepts Covered: Exception Handling, Multiple Catch Blocks, Finally */

import java.util.*;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Explicitly throw exception if denominator is zero
            if (denominator == 0) {
                throw new ArithmeticException("Denominator cannot be zero!");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution finished...");
            sc.close();//to prevent resource leaks
        }
    }
}
