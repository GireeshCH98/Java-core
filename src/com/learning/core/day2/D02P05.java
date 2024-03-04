package com.learning.core.day2;

import java.util.Scanner;
//Given number divisible by 5 or not
public class D02P05 
{
	static boolean isDivisibleBy5(String num)
	{
		int sz = num.length(); // Number of Digits
		// Checking if last digit is 5 or 0
		return (

            (Integer.parseInt(num.substring(sz - 1)) == 5) || (Integer.parseInt(num.substring(sz - 1)) == 0));

    }

    public static void main(String[] args)

    {
    	Scanner X = new Scanner(System.in);
		System.out.print("Enter Number : ");
		String num = X.next();

        if (isDivisibleBy5(num))
        		System.out.println("Yes");
        else
        	System.out.println("No");
    }
}