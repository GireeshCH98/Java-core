package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 
{
	public static String findLongestPrefixSuffix(String input) {
        int n = input.length();
        
        // Traverse the string from the middle
        for (int i = n/2; i >= 0; i--) {
            // Check if the prefix of length i is equal to the suffix of length i
            if (input.substring(0, i).equals(input.substring(n-i))) {
                return input.substring(0, i);
            }
        }
        
        return ""; // No prefix-suffix match found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text pattern: ");
        String input = scanner.nextLine();
        
        String longestPrefixSuffix = findLongestPrefixSuffix(input);
        
        if (longestPrefixSuffix.isEmpty()) {
            System.out.println("No non-overlapping suffix that is also a prefix.");
        } else {
            System.out.println("Lenght of Longest prefix of "+ longestPrefixSuffix +" is :" + longestPrefixSuffix.length());
        }
        
        scanner.close();
    }
}
