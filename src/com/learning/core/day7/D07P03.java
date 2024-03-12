package com.learning.core.day7;

import java.util.*; 
  
class D07P03 
{   
    public static String ReverseString(String str) 
    { 
        char[] reverseString = new char[str.length()]; 
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < str.length(); i++) 
        { 
            stack.push(str.charAt(i)); 
        } 
        
        int i = 0; 
        while (!stack.isEmpty()) 
        { 
            reverseString[i++] = stack.pop(); 
        } 
        return new String(reverseString); 
    } 
    
    public static void main(String[] args) 
    { 
        String str1 = "JavaQuiz"; 
        System.out.println(ReverseString(str1));
    } 
}
