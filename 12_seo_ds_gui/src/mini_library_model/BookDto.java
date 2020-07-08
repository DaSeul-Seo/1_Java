package mini_library_model;

public class BookDto {
	int num;
	String title, author, publisher, rental;
	
	public BookDto() {
		// TODO Auto-generated constructor stub
	}

	public BookDto(int num, String title, String author, String publisher, String rental) {
		this.num = num;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.rental = rental;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		this.rental = rental;
	}

	@Override
	public String toString() {
		return "BookDto [" + num + ", " + title + ", " + author + ", " + publisher
				+ ", " + rental + "]";
	}
	
}
