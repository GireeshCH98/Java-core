package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P02
{
	public static void main(String[] args) 
	{
	    // Creating a HashMap to store phone book details
	    Map<String, String> phoneBook = new HashMap<>();

	    // Adding predefined phone book details
	    phoneBook.put("Amal", "998787823");
	    phoneBook.put("Manvitha", "937843978");
	    phoneBook.put("Joseph", "7882221113");
	    phoneBook.put("Smith", "8293893311");
	    phoneBook.put("Kathe", "7234560011");

	    // Name to search
	    String searchName = "Joseph";

	    // Searching for the phone number
	    String phoneNumber = phoneBook.get(searchName);

	    // Outputting the phone number if found
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

