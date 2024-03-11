package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P02
{
	public static void main(String[] args) 
	{
	    Map<String, String> phoneBook = new HashMap<>();
		
	    phoneBook.put("Amal", "998787823");
	    phoneBook.put("Manvitha", "937843978");
	    phoneBook.put("Joseph", "7882221113");
	    phoneBook.put("Smith", "8293893311");
	    phoneBook.put("Kathe", "7234560011");

	    String searchName = "Joseph";

	    String phoneNumber = phoneBook.get(searchName);

	    if (phoneNumber != null) 
	    {
	    	System.out.println(phoneNumber);
	    } 
	    else 
	    {
	    	System.out.println("No phone number found for " + searchName);
	    }
	}
}

