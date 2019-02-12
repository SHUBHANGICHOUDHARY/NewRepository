package com.author.book;

public class Book
{
	private String bookName;
	private Author author ;
	private double bookPrice;
	private int bookQuantity;
	
	public Book(String bookName,Author author, double bookPrice,int bookQuantity) {
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
		this.bookQuantity = bookQuantity;
		
	}

	

	public int getQuantity() {
		return bookQuantity;
	}

	public void setQuantity(int quantity) {
		this.bookQuantity = quantity;
	}

	public String getName() {
		return bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return bookPrice;
	}

	@Override
	public String toString() {
		return "Book [name=" + bookName + ", author=" + author + ", price=" + bookPrice + ", quantity=" + bookQuantity + "]";
	}

}
