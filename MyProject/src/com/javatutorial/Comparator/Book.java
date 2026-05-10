package com.javatutorial.Comparator;
import java.util.*;
public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private int year;
	
	public Book(String title ,String author ,int year) {
		this.title=title;
		this.author=author;
		this.year=year;
		
	}
	
	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public int getYear() {
		return year;
	}


	public String toString() {
		
		return " title: "+title+", author: "+author+" , year: "+year;
		
	}
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Hound Of BaskerVille","Sherlock Holmes",1987));
		books.add(new Book("Trojans Of War","Roger lancley",1975));
		books.add(new Book("Gullivers Travel","Jonathan Swift",1878));
		
		Collections.sort(books);
		
		for(Book bs:books)
		System.out.println(bs);

	}

	@Override
	public int compareTo(Book anotherBook) {
		
		return this.author.compareTo(anotherBook.author);
	}
	

}
