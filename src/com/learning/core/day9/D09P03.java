package com.learning.core.day9;

import java.util.Scanner;

class D09P03 
{
    public static void main(String[] args) 
    {
    	int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int j = 0; j < size; j++) 
        {  
        	array[j] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        if (linear(array, target))
        {
        	System.out.println("Element is Present");
        } 
        else 
        {
                System.out.println("Element is Not Present");
        }
    }

    public static boolean linear(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }
}
