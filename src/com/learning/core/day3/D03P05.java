package com.learning.core.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class D03P05 
{
	public static void findCombinations(int[] A, int i, int k,
            Set<List<Integer>> subarrays,
            List<Integer> out)
	{
		if (A.length == 0 || k > A.length)
		{
			return;
		}
		if (k == 0) 
		{
			subarrays.add(new ArrayList<>(out));
			return;
		}
		// start from the next index till the last index
		for (int j = i; j < A.length; j++)
		{
			// add current element A[j] to the solution and recur for next index
			// j+1 with one less element k-1
			out.add(A[j]);
			findCombinations(A, j + 1, k - 1, subarrays, out);
			out.remove(out.size() - 1);        // backtrack
		}
	}

	public static Set<List<Integer>> findCombinations(int[] A, int k)
	{
		Set<List<Integer>> subarrays = new HashSet<>();
		findCombinations(A, 0, k, subarrays, new ArrayList<>());
		return subarrays;
	}

	public static void main(String[] args)
	{
		int k;
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size =scan.nextInt();
        int[] A = new int[size];
        System.out.println("Enter Array Elements :");
        for(int i=0;i<A.length;i++)
        {
        	A[i]= scan.nextInt();
        }
        for(int x:A) 
        {
        	System.out.print(x+" ");
        }
        System.out.println("\nEnter K Value :");
        k = scan.nextInt();

		// process elements from left to right
		System.out.println(findCombinations(A, k));
	}
}
