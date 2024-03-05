package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 // display the length of the string. Also display the string into Uppercase and check whether it is a palindrome or not
{
	static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
 
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
        return true;
    }
	
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    	System.out.println("Enter a string: ");  
    	String str1= sc.nextLine();
    	String str = str1.toLowerCase();
    	
    	String up = str1.toUpperCase();
    	
    	System.out.println("String Lenght is : "+str.length());
    	System.out.println("String in Uppercase : "+up);
 
        if (isPalindrome(str))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");

        System.out.println();
    }
}
