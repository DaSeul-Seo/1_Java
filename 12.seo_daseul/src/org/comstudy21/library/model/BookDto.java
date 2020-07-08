package org.comstudy21.library.model;

public class BookDto {
	int bookidx;
	String booktitle, bookauthor, bookpublish, rental;
	public BookDto() {
		this(0,"","","","");
	}
	public BookDto(int bookidx, String booktitle, String bookauthor, String bookpublish, String rental) {
		this.bookidx = bookidx;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookpublish = bookpublish;
		this.rental = rental;
	}
	public int getBookidx() {
		return bookidx;
	}
	public void setBookidx(int bookidx) {
		this.bookidx = bookidx;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookpublish() {
		return bookpublish;
	}
	public void setBookpublish(String bookpublish) {
		this.bookpublish = bookpublish;
	}
	public String getRental() {
		return rental;
	}
	public void setRental(String rental) {
		this.rental = rental;
	}
	@Override
	public String toString() {
		return "[" + bookidx + " | " + booktitle + " | " + bookauthor + " | " + bookpublish + " | " + rental + "]";
	}
	
}
