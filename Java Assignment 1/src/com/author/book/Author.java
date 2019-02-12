package com.author.book;

public class Author 
{
	private String authorName;
	private String authorEmail;
	private char authorGender;
	
	public Author(String authorname,String authoremail, char authorgender) {
		this.authorName= authorname;
		this.authorEmail =authoremail;
		this.authorGender = authorgender;
	}

	public String getName() {
		return authorName;
	}

	public void setName(String name) {
		authorName= name;
	}

	public String getEmail() {
		return authorEmail;
	}

	public void setEmail(String email) {
		authorEmail = email;
	}

	public char getGender() {
		return authorGender;
	}

	public void setGender(char gender) {
		this.authorGender = gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + authorName + ", email=" + authorEmail + ", gender=" + authorGender + "]";
	}
}
