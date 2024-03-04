package com.learning.core.day2;

import java.util.Scanner;
//Print week days using if statement
public class D02P06 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Week Number(1-7) :");
		int num = input.nextInt();			
	
		if(num==1)
			System.out.println("Monday");
		else if(num==2)
			System.out.println("Tuesday");
		else if(num==3)
			System.out.println("Wednesday");
		else if(num==4)
			System.out.println("Thursday");
		else if(num==5)
			System.out.println("Friday");
		else if(num==6)
			System.out.println("Saturday");
		else if(num==7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid Input");
	}
}
