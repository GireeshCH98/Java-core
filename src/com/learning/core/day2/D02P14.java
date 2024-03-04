package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 
{
	public static void main(String[] args)    
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the base value: ");  
        int base = sc.nextInt();  
        System.out.println("Enter the exponent value: ");  
        int exp = sc.nextInt();  
        long result = 1;
        System.out.print(base+ " raised to the power "+ exp+" is: ");
        while (exp != 0)
        {
            result *= base;
            --exp;
        }
        System.out.println(result);
   }
}
