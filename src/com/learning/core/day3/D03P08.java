package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 
{
	public static int min(int x, int y) 
	{ 
	    return (x < y) ? x : y; 
	}
	public static int utility_fun_for_del(String str,int i, int j)
	{
	    if (i >= j)
	        return 0;

	    if (str.charAt(i) == str.charAt(j)) 
	    {
	        return utility_fun_for_del(str,i + 1, j - 1);
	    }
	    return 1 + Math.min(utility_fun_for_del(str, i + 1, j),utility_fun_for_del(str, i, j - 1));
	}
	
	public static int min_ele_del(String str)
	{
	    return utility_fun_for_del(str, 0,str.length() - 1);
	}
	
	public static void main(String[] args) 
	{
	    Scanner X = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = X.next();
	    System.out.println("Minimum element of deletions = " +min_ele_del(str));
	}
}
