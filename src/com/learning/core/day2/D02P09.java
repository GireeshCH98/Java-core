package com.learning.core.day2;

import java.util.Scanner;

public class D02P09 
{
	 public static void main(String[] args)

	 {
	     int i,n;

	     System.out.print("Enter the number : ");
	     Scanner in = new Scanner(System.in);
	     n = in.nextInt();

	     for(i=1;i<=n;i++)
	     {
	    	 System.out.println((i*i*i));     
	     }
	 }
}
