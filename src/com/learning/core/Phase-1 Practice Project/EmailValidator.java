package com.learning.core.PracticeProject;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String[] eIds = {"john@xyz.com","aby123@abc.com","kiran1991@bca.com","yasir@abc.com",
					"suresh.1@abc.com","zak5.a@abc.edu.in","test@example.com","user123@gmail.com","john.doe@company.co.in"};
	
	System.out.println("Enter the email ID to search: ");
	String sid = sc.next();
	
	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(sid);
    
    if(matcher.matches()== true)
    {
    	int flag = 0;
		
		for(String s : eIds)
		{
			if(s.equalsIgnoreCase(sid))
			{
				System.out.println("The given Email ID is present.");
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("The given Email ID is not present.");
    }
    else
    	System.out.println("Enter valid email id!");
}
}
