package com.learning.core.day3;

import java.util.Scanner;

public class D03P04 
{
	public static int firstRepeatingElement(int[] arr, int n) 
	{
        for (int i = 0; i < n; i++) // Nested loop for repeating elements
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
 
    public static void main(String[] args) 
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size =scan.nextInt();
        int[] num = new int[size];
        int n = num.length;
        System.out.println("Enter Array Elements :");
        for(int i=0;i<num.length;i++)
        {
        	num[i]= scan.nextInt();
        }
        for(int x:num) 
        {
        	System.out.print(x+" ");
        }
        System.out.println();
        int index = firstRepeatingElement(num, n);
 
        if (index == -1) {
            System.out.println("No repeating element found!");
        }
        else 
        {
            System.out.println("First repeating element is " + num[index]);
        }
    }
}
