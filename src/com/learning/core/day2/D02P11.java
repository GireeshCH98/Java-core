package com.learning.core.day2;

import java.util.Scanner;

public class D02P11 
{
	public static void main(String[] args)

	{
	   int i,j,n;
	   System.out.println("Enter the number : ");
	   Scanner in = new Scanner(System.in);
	   n = in.nextInt();

	   for(i=1;i<=n;i++)
	   {
		for(j=1;j<=i;j++) 
		{
		  System.out.print(j);
		  System.out.print(" ");
		}
		System.out.println("");
	   }
    }
}
