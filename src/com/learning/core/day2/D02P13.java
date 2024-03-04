package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 
{
	public static void main(String[] args) 
	{
		int i=1;
		System.out.println("Enter the number : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

