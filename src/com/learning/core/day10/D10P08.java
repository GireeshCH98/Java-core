package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class D10P08 
{

	 @Test
	    public void testMul() 
	 {
	        Calculator calculator = new Calculator();
	        assertEquals(6, calculator.mul(2, 3));
	        assertEquals(0, calculator.mul(0, 3));
	        assertEquals(-8, calculator.mul(4, -2));
	    }

	    @Test
	    public void testDiv() 
	    {
	        Calculator calculator = new Calculator();
	        assertEquals(3, calculator.div(9, 3));
	        assertEquals(-4, calculator.div(8, -2));
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testDivByZero() 
	    {
	        Calculator calculator = new Calculator();
	        calculator.div(10, 0);
	    }
}