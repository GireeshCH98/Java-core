package com.learning.core.day2;

import java.util.Scanner;
//Print reverse pyramid * pattern
public class D02P12 
{
	public static void main(String[] args)
    {
		System.out.println("Enter the number : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
 
        int i = num, j;
        
        while (i > 0) {
            j = 0;

            while (j++ < num - i) 
            {
            	System.out.print(" ");
            }
 
            j = 0;
            
            while (j++ < (i * 2) - 1) 
            {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }

}
