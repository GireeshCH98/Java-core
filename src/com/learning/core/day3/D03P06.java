package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 
{
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("\nNumber of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
	public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++; 
                System.out.print(str.charAt(i));
            }
            
        }
        return count;
    }
}

