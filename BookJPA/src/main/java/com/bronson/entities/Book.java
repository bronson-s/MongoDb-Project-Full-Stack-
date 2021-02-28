package com.bronson.entities;


import javax.persistence.Id;



public class Book {

	//Fields
	@Id
	private long id;
	private String title;
	private String author;
	private int pagecount;
	
	//Constructors
	public Book(long id, String title, String author, int pagecount) {
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
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", pagecount=" + pagecount + "]";
	}

	
	//Hashcode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	

}
