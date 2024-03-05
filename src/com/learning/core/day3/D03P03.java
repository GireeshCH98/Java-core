package com.learning.core.day3;

import java.util.Arrays;
import java.util.Scanner;

public class D03P03 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int[] A = new int[18];
	        
	        System.out.println("Enter 18 integer values:");
	        for (int i = 0; i < A.length; i++) 
	        {
	            A[i] = scanner.nextInt();
	        }
	        
	        int sum = 0;
	        for (int i = 0; i < 15; i++) 
	        {
	            sum += A[i];
	        }
	        A[15] = sum;
	       
	        double average = (double) sum / 15;
	        A[16] = (int) average;

	       
	        int smallest = A[0];
	        for (int i = 1; i < 15; i++) {
	            if (A[i] < smallest) {
	                smallest = A[i];
	            }
	        }
	        A[17] = smallest;
	    
	        System.out.print("Output: ");
	        for (int i : A) {
	            System.out.print(i + " ");
	        }
	    }
}
