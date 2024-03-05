package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 
{
	 public static void main(String[] args) 
	    {
	        //String str = "Mr John Smith   ";
	       Scanner sr = new Scanner(System.in); 
		    System.out.println("Enter a String:");
		    String str = sr.next();
	        str = str.trim();
	        str = str.replaceAll(" ", "%20");
	        System.out.println(str);
	    }
}
