package com.learning.core.day1;

public class Medicine 
{

	public void displayLabel()
	{
		System.out.println("Company : Globex Pharma");
		System.out.println("Address : Bangalore");
	}
}

class Tablet extends Medicine
{
	public void displayLabel()
	{
		System.out.println("Store Tablets in a cool dry place.");
	}
}

class Syrup extends Medicine
{
	public void displayLabel()
	{
		System.out.println("Syrup is consumable only on prescription.");
	}
}

class Ointment extends Medicine
{
	public void displayLabel()
	{
		System.out.println("Ointment is for external use only.");
	}
}