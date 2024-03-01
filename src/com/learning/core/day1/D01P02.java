package com.learning.core.day1;

public class D01P02 
{
	public static void main(String[] args)
	{
		
		Medicine n = new Medicine();
		n.displayLabel();
		
		System.out.println("_______________________________________");
		
		Medicine m = new Tablet();
		m.displayLabel();
		
		Medicine l = new Syrup();
		l.displayLabel();
		
		Medicine k = new Ointment();
		k.displayLabel();
		
	}
}
