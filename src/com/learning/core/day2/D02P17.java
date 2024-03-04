package com.learning.core.day2;

import java.util.Scanner;
//Prime number from 1 to N
public class D02P17 
{
	private static Scanner scanner = new Scanner( System.in );
	 
    public static void main(String[] args) {
 
        System.out.println("Enter max number: ");
 
        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );
 
        System.out.println("List of the prime number from 1 to " + maxNumber);
 
        for (int num = 2; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
    }
}
