package com.learning.core.day1;

interface Medicine 
{
	public void displayLabel();
}

class Tablet implements Medicine
{
	@Override
	public void displayLabel() 
	{
		System.out.println("Store Tablets in a cool dry place.");
	}
	
}

class Syrup implements Medicine
{
	@Override
	public void displayLabel()
	{
		System.out.println("Syrup is consumable only on prescription.");
	}
}

class Ointment implements Medicine
{
	@Override
	public void displayLabel()
	{
		System.out.println("Ointment is for external use only.");
	}
}