package com.learning.core.day1;

public class D01P01 
{
	public static Book1 createBook(String title, double price) 
	{
		Book1 book = new Book1();
		book.setBookTitle(title);
		book.setBookPrice(price);
		return book;
	}
	public static void showBook(Book1 book)
	{
		//System.out.println("hi");
		System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
	}
	public static void main(String[] args)
	{
		// Input
		String title = "Java Programming";
		double price = 350.00;
		
		// Create and show book
		Book1 myBook = createBook(title, price);
		showBook(myBook);
    }
}
