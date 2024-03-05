package com.learning.core.day3;

import java.util.Scanner;

public class D03P12 
{
	 public static boolean strcheck(String s1, String s2) 
	  { 
	    if(s1.compareTo(s2) != 0)
	                {
	                    return true;
	                }
	                return false;
	  } 
	  public static void main(String[] args) 
	  { 
	    Scanner sr = new Scanner(System.in); 
	    System.out.println("Enter a String:");
	    String s = sr.next();
	    int flag=0;
	    if(s.length()>=10)
	                {
	                    flag=1;
	                }
	    else
	                { 
	                    for (int i = 1; i < s.length(); i++) 
	                    { 
	                            for (int j = i + 1; j < s.length(); j++) 
	                            { 
	                                    for (int k = j + 1; k < s.length(); k++) 
	                                    { 
	                                            String s1 = "", s2 = "", s3 = "", s4 = ""; 
	                                            s1 = s.substring(0, i); 
	                                            s2 = s.substring(i, j); 
	                                            s3 = s.substring(j, k); 
	                                            s4 = s.substring(k, s.length());
	                                            if(strcheck(s1, s2) && strcheck(s1, s3) && strcheck(s1, s4) && strcheck(s2, s3) && strcheck(s2, s4) && strcheck(s3, s4)) 
	                                            {
	                                                    flag=1; 
	                                            }
	                                    } 
	                            } 
	                    } 
	                }
	                if(flag==1)
	                {
	                    System.out.println("Yes");
	                }
	                else
	                {
	                    System.out.println("No");
	                }
	  } 
}
