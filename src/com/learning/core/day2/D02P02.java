package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 
{
	public static void main(String[] args) 
	{
		int n=0,i=0;
		
		Scanner X = new Scanner(System.in);
		System.out.print("Enter Number : ");
		n = X.nextInt();

	    for(i=1; i<n; i++)
	    {
	    	if(i%2==0)
	    		System.out.print(i+" ");
	    }    
	    System.out.println();
	 }
}
