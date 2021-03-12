package com.bronson.entities;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.data.mongodb.core.mapping.Document;

//
//@Document(collection = "user")
public class Book {

	//Fields
	@Id
//	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id;
	private String title;
	private String author;
	private Integer pagecount;
	
	//Constructors
	public Book(long id, String title, String author, Integer pagecount) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.pagecount = pagecount;
	}
	
	//Getters and Setters
	public Book() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPagecount() {
		return pagecount;
	}
	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", pagecount=" + pagecount + "]";
	}

	
	//Hashcode and Equals




	
	
	
	
	
	
	
	
	

}
