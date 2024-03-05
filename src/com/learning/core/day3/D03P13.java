package com.learning.core.day3;

public class D03P13 
{
	 public static void replaceSpaces(String input)
	  {
	    String rep = "%20";
	    for (int i = 0; i < input.length(); i++) 
	    {
	      if (input.charAt(i) == ' ') 
	      {
	        StringBuilder string = new StringBuilder(input);
	        string.setCharAt(i, rep);
	      }
	    }
	    System.out.println(input);
	  }
	  public static void main(String[] args)
	  {
	    System.out.println("GFG!");
	    String input = "Mr John Smith";
	    replaceSpaces(input);
	  }
}
