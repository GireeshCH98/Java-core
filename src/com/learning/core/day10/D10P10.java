package com.learning.core.day10;

import org.junit.Test;

class UserProfile
{
	public static void validateUsername(String name)
	{
		if (!name.matches("[a-zA-Z]+")) 
		{
            throw new IllegalArgumentException("Only characters allowed in User Name.");
        }
	}
	public static void validatePassword(String password) 
	{
        if (password.length() != 8 || !password.matches("[a-zA-Z0-9]+")) 
        {
            throw new IllegalArgumentException("Password should contain only alphabets and digits and must contain eight characters.");
        }
    }
}

public class D10P10 
{
	private static final UserProfile u = new UserProfile();

    @Test(timeout = 2)
    public void testName() 
    {
        u.validateUsername("MyName");
    }

    @Test(timeout = 2)
    public void testPassword()
    {
    	u.validatePassword("pass1234");
    }
}
