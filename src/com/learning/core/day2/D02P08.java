package com.learning.core.day2;

import java.util.Scanner;

public class D02P08 
{
	public static void main(String[] args) 
	{
		int i=0;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int sum = 0;
		
		for(i=num1;i<=num2;i++) 
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}
