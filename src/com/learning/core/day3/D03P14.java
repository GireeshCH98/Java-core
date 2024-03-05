package com.learning.core.day3;

import java.util.Scanner;

public class D03P14 
{
	 public static int nextDistinct(int[] arr, int x) 
	 {
	        while (x < arr.length - 1 && arr[x] == arr[x + 1]) 
	        {
	            x++;
	        }
	        return x + 1;
	    }

	    public static void printUnion(int[] arr1, int[] arr2) 
	    {
	        int i = 0;
	        int j = 0;	         

	        while (i < arr1.length && j < arr2.length) 
	        {
	            if (arr1[i] < arr2[j]) 
	            {
	                System.out.print(arr1[i] + " ");
	                i = nextDistinct(arr1, i);
	            } 
	            else if (arr1[i] > arr2[j]) 
	            {
	                System.out.print(arr2[j] + " ");
	                j = nextDistinct(arr2, j);
	            }
	            else 
	            {
	                System.out.print(arr1[i] + " ");
	                i = nextDistinct(arr1, i);
	                j = nextDistinct(arr2, j);
	            }
	        }

	        while (i < arr1.length) 
	        {
	            System.out.print(arr1[i] + " ");
	            i = nextDistinct(arr1, i);
	        }
	        
	        while (j < arr2.length) 
	        {
	            System.out.print(arr2[j] + " ");
	            j = nextDistinct(arr2, j);
	        }
	    }

	    static void printIntersection(int arr1[], int arr2[], int m, int n)
	    {
	        int i = 0, j = 0;
	        while (i < m && j < n) 
	        {
	            if (arr1[i] < arr2[j])
	                i++;

	            else if (arr2[j] < arr1[i])
	                j++;

	            else 
	            {
	                System.out.print(arr2[j++] + " ");
	                i++;
	            }
	        }
	    }	 

	    public static void main(String args[])
	    {
	        //int arr1[] = { 1, 2, 4, 5, 6 };
	        //int arr2[] = { 2, 3, 5, 7 };
	    	
	    	Scanner scan= new Scanner(System.in);
	        System.out.println("Enter First Array Size:");
	        int size =scan.nextInt();
	        int[] arr1 = new int[size];
	        System.out.println("Enter Array Elements :");
	        for(int i=0;i<arr1.length;i++)
	        {
	        	arr1[i]= scan.nextInt();
	        }
	        for(int x:arr1) 
	        {
	        	System.out.print(+x+" ");
	        }
	        System.out.println("\n\nEnter Second Array Size:");
	        int size1 =scan.nextInt();
	        int[] arr2 = new int[size1];
	        System.out.println("Enter Array Elements :");
	        for(int i=0;i<arr2.length;i++)
	        {
	        	arr2[i]= scan.nextInt();
	        }
	        for(int x:arr2) 
	        {
	        	System.out.print(+x+" ");
	        }
	        int m = arr1.length;
	        int n = arr2.length;
	        
	        System.out.println("\n\nUnion of two arrays");
	        printUnion(arr1, arr2);
	        System.out.println("\nIntersection of two arrays");
	        printIntersection(arr1, arr2, m, n);

	    }
}
