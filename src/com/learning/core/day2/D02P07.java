package com.learning.core.day2;

import java.util.Scanner;
// Grade based on marks
public class D02P07 
{
	 public static void main(String args[])
	    {
	        Scanner marks = new Scanner(System.in);
	        System.out.print("Enter the Percentage between 1 to 100 :");
			int num = marks.nextInt();
			
	        if(num>=60)
	        {
	            System.out.print("Grade A");
	        }
	        else if(num>=45 && num<60)
	        {
	           System.out.print("Grade B");
	        } 
	        else if(num>=35 && num<45)
	        {
	            System.out.print("Grade C");
	        }
	        else
	        {
	            System.out.print("Fail");
	        }
	    }
}
