package com.author.book;

public class AuthorBookMain
{

	public static void main(String[] args) 
	{
		
			Author author = new Author ("Seshu","seshu11@gmail.com",'m');			
			Book book = new Book("Positive Vibes",author,5699.998,2);
			book.setQuantity(6);
			System.out.println(book);
	}

}


