package com.learning.core.day4;

import java.util.InputMismatchException;

public class D04P02 
{
	private String playerName;
	private float critic1, critic2, critic3;
	private float avgRating;
	private String coins;

	public static class NotEligibleException extends Exception 
	{
		public NotEligibleException(String message) 
		{
			super(message);
		}
	}

	public D04P02(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException 
	{
		this.playerName = playerName;
		validateCriticRatings(critic1, critic2, critic3);
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		calculateAverageRating(critic1, critic2, critic3);
	}
	public D04P02(String playerName, float critic1, float critic2) throws NotEligibleException 
	{
		this(playerName, critic1, critic2, 0.0f); // Call constructor with default value for critic3
	}
    private void validateCriticRatings(float critic1, float critic2, float critic3) throws NotEligibleException 
    {
    	if (critic1 < 0 || critic1 > 10 || critic2 < 0 || critic2 > 10 || critic3 < 0 || critic3 > 10) 
    	{
    		throw new NotEligibleException("Critic ratings must be between 0 and 10.");
    	}
    }

    public void calculateAverageRating(float critic1, float critic2) throws NotEligibleException 
    {
    	validateCriticRatings(critic1, critic2, 0.0f); // Validate even for 2 critics
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.avgRating = (critic1 + critic2) / 2.0f;
		calculateCoins();
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) throws NotEligibleException 
    {
    	validateCriticRatings(critic1, critic2, critic3);
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		this.avgRating = (critic1 + critic2 + critic3) / 3.0f;
		calculateCoins();
	}

    private void calculateCoins() throws NotEligibleException 
    {
    	if (avgRating < 2) 
    	{
    		System.out.println("");
    		System.out.println("Player Name: " + playerName);
    		throw new NotEligibleException("Average rating is less than 2. \nPlayer is not eligible for any coins.");
		} 
    	else if (avgRating >= 7) 
		{
    		coins = "Gold";
		} 
    	else if (avgRating >= 5) 
    	{
    		coins = "Silver";
    	} 
    	else 
    	{
    		coins = "Copper";
    	}
    }

    public void display() 
    {
    	System.out.println("Player Name: " + playerName);
		System.out.println("Critic 1 Rating: " + critic1);
		System.out.println("Critic 2 Rating: " + critic2);
		if (critic3 != 0.0f) 
		{
			System.out.println("Critic 3 Rating: " + critic3);
		}
		System.out.println("Average Rating: " + avgRating);
		System.out.println("Coins: " + coins);
    }
    public static void main(String[] args) 
    {
    	try 
    	{
    		D04P02 player1 = new D04P02("John", 9.3f, 9.67f, 8.7f);
		    player1.display();
		    
		}
    	catch (NotEligibleException e)
    	{   
    		System.out.println(e.getMessage());
		} 
    	catch (InputMismatchException e) 
    	{
    		System.out.println("Invalid input format. Please enter numeric values for critic ratings.");
		}
    	try
    	{
    		D04P02 player2 = new D04P02("Henry", 1.5f, 0f, 0f);
    		player2.display();
    	}
    	catch (NotEligibleException e)
    	{   
    		System.out.println(e.getMessage());
		} 
    	catch (InputMismatchException e) 
    	{
    		System.out.println("Invalid input format. Please enter numeric values for critic ratings.");
		}
    }
}
