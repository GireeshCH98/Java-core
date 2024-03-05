package com.learning.core.day3;

import java.util.Scanner;

public class D03P13 
{
	/* public static void main(String[] args) 
	    {
	        String str = "Mr John Smith   ";
	        System.out.println(input);
	        str = str.trim();
	        str = str.replaceAll("\\s", "%20");
	        System.out.println(str);
	    } */
	public static String replaceSpaces(String str) 
	{
		char[] charArray = str.toCharArray();
		int spaceCount = 0;
        for (char c : charArray) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        int newLength = str.length() + (spaceCount * 2);
        char[] newCharArray = new char[newLength];
        
        int index = 0;
        for (char c : charArray) {
            if (c == ' ') {
                newCharArray[index++] = '%';
                newCharArray[index++] = '2';
                newCharArray[index++] = '0';
            } 
            else 
            {
                newCharArray[index++] = c;
            }
        }

        return new String(newCharArray);
    }

    public static void main(String[] args) {
        String input = "Mr John Smith";
        System.out.println(input);
        String output = replaceSpaces(input);
        System.out.println(output);
    }

}
