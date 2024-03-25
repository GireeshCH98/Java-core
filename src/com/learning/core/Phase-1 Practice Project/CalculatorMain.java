package com.learning.core.PracticeProject;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
    	
    	final Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Arithmetic Calculator");
                
        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            final int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator...");
                break;
            }
            
            if (choice > 5) {
            	System.out.println("Invalid choice! Please select again.");
            }
            
            else {       	
            	System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();
	
	            // Perform arithmetic operations using Calculator object
	            switch (choice) {
	                case 1:
	                    System.out.println("Result: " + Calculator.add(num1, num2));
	                    break;
	                case 2:
	                    System.out.println("Result: " + Calculator.subtract(num1, num2));
	                    break;
	                case 3:
	                    System.out.println("Result: " + Calculator.multiply(num1, num2));
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        System.out.println("Result: " + Calculator.divide(num1, num2));
	                    } else {
	                        System.out.println("Error! Division by zero is not allowed.");
	                    }
	                    break;
	            }
            }
        }
        scanner.close();
    }
}