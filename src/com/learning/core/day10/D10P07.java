package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class D10P07 
{
	@Test
	public void testAdd()
	{
		System.out.println("Testing Add method.");
		assertEquals(20,Calculator.add(10,10));
	}
	
	@Test
	public void testSub()
	{
		System.out.println("Testing Sub method.");
		assertEquals(20,Calculator.sub(30,10));
	}
}
