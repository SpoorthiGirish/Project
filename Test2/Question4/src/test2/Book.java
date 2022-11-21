package test2;

public class Book {

	private String title;
	private String author;
	private int price;
	private String genre;
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
	public int getPrice() {
	return price;
	}
	public void setPrice(int price) {
	this.price = price;
	}
	public String getGenre() {
	return genre;
	}
	public void setGenre(String genre) {
	this.genre = genre;
	}
	public Book(String title, String author, int price, String genre) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	this.genre = genre;
	}
	public Book() {
	super();
	}

	}
