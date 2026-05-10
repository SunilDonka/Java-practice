package com.javatutorials.encapsulation;

public class Book {
	private String title;
	private int year;
	private String author;
	
	public Book(String title,int year,String author) {
		this.title=title;
		this.year=year;
		this.author=author;
		
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void  publish(int n) {
		if(n<2000) {
			System.out.println("book details found");
		}
		else {
			System.out.println("book details not found");
		}
		
	}
	
	public static void main(String[] args) {
		Book bs = new Book("sholey",2002,"bachan");
	
		bs.publish(2002);
		
		
		
	}
	
	
	

}
