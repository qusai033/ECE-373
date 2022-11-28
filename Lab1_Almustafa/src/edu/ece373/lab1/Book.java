package edu.ece373.lab1;

public class Book {

	private String author;
	private String title; 
	private Person person;

	public Book() {
		super();
	}

	public Book(String author, Person person, String title) {
		this.author = author;
		this.title = title;
		this.person = person;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}