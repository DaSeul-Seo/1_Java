package org.comstudy21.day14_hw02;
/*Product클래스는 각 상품의 고유한 식별자, 상품설명, 생산자, 가격정보를 포함.
 * Book클래스틑 ISBN번호, 저자, 책 제목 정보를 포함
 * CompactDisc클래스는 앨범제목, 가수이름 정보 포함
 * ConversationBook은 회화책에서 다루는 언어명 정보를 포함
 * 적절한 접근지정자, 필드, 메소드, 생성자 등을 작성
 * ProductInfo클래스를 만들고 이곳에 main을 둔다.
 * main()에서는 최대 10개의 상품을 추가할 수 있으면 모든 상품의 정보를 조회할 수 있다.
 * 상품에 대한 정보를 출력할 때 Product타입의 레퍼런스를 이용하라*/

import java.util.ArrayList;
import java.util.Scanner;

class Product{
	Scanner scan = new Scanner(System.in);
	protected int price;
	protected String explan, producer;
	
	void setExplan(String explan) {
		this.explan = explan;
	}
	void setProducer(String producer) {
		this.producer = producer;
	}
	void setPrice(int price) {
		this.price = price;
	}
	String getExplan() {
		return explan;
	}
	String getProducer() {
		return producer;
	}
	int getPrice() {
		return price;
	}
	
	void input() {
		System.out.print("상품설명>> ");
		explan = scan.next();
		System.out.print("생산자>> ");
		producer = scan.next();
		System.out.print("가격>> ");
		price = scan.nextInt();
		
	}
	
//	public Product( String explan, String producer, int price) {
//		this.explan = explan;
//		this.producer = producer;
//		this.price = price;
//	}
	public void showProduct() {
		System.out.println("상품 설명>> " + explan);
		System.out.println("생산자>> " + producer);
		System.out.println("가격>> " + price);
	}
}

class Book extends Product{
	int isbn;
	String author, booktitle;
	
	void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setISBN(int isbn) {
		this.isbn = isbn;
	}
	String getBooktitle() {
		return booktitle;
	}
	String getAuthor() {
		return author;
	}
	int getISBN() {
		return isbn;
	}

//	public Book(String explan, String producer, int price,
//			String booktitle, String author,int isbn) {
//		super(explan,producer,price);
//		this.isbn = isbn;
//		this.author = author;
//		this.booktitle = booktitle;
//	}
	public Book() {
		super.input();
		System.out.print("책 제목>> ");
		booktitle = scan.next();
		System.out.print("저자>> ");
		author = scan.next();
		System.out.print("ISBN>> ");
		isbn = scan.nextInt();
	}
	public void showProduct() {
		super.showProduct();
		System.out.println("책 제목>> " + booktitle);
		System.out.println("저자>> " + author);
		System.out.println("ISBN>> " + isbn);
	}
}

class CompactDisc extends Product{
	String albumtitle, singername;
	
	void setAlbumtitle(String albumtitle) {
		this.albumtitle = albumtitle;
	}
	void setSingername(String singername) {
		this.singername = singername;
	}
	String getAlbumtitle() {
		return albumtitle;
	}String getSingername() {
		return singername;
	}
	
//	public CompactDisc(String explan, String producer, int price,
//			String albumtitle, String singername) {
//		super(explan,producer,price);
//		this.albumtitle = albumtitle;
//		this.singername = singername;
//	}
	public CompactDisc() {
		super.input();
		System.out.print("앨범제목>> ");
		albumtitle = scan.next();
		System.out.print("가수이름>> ");
		singername = scan.next();
	}
	public void showProduct() {
		super.showProduct();
		System.out.println("앨범제목>> " + albumtitle);
		System.out.println("가수이름>>  " + singername);	
	}
}

class ConversationBook extends Book{
	String language;
	
	void setLanguage(String language) {
		this.language = language;
	}
	String getLanguage() {
		return language;
	}
	
//	public ConversationBook(String explan, String producer, int price,
//			String booktitle, String author,int isbn,String language) {
//		super(explan,producer,price,booktitle,author,isbn);
//		this.language = language;
//	}
	public ConversationBook() {
		super.input();
		System.out.print("언어>> ");
		language = scan.next();
	}
	public void showProduct() {
		super.showProduct();
		System.out.println("언어>> " + language);	
	}
}

public class Training07 {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Product> list = new ArrayList<Product>();
	public static void main(String[] args) {
		while(true) {
			System.out.print("상품추가<1>, 모든 상품 조회<2>, 끝내기<3> >> ");
			int no = scan.nextInt();
			switch(no) {
			case 1: Input(list); break;
			case 2: Output(list); break;
			case 3:
				System.out.println("종료합니다.");
				System.exit(0);
			default : System.out.println("잘못입력하였습니다. 다시 입력하세요.");
			}
		}
	}
	public static void Output(ArrayList<Product> p) {
		int id = 1;
		for(int i = 0; i<p.size(); i++) {
			System.out.println("===== 상품" + id + " =====");
			p.get(i).showProduct();
			id++;
		}
	}
	public static void Input(ArrayList<Product> p) {
		System.out.print("상품 종류  책<1>, 음악CD<2>, 회화책<3> >> ");
		int no = scan.nextInt();
		switch(no) {
		case 1:
			p.add(new Book());
			break;
		case 2:
			p.add(new CompactDisc());
			break;
		case 3:
			p.add(new ConversationBook());
			break;
		default: System.out.println("잘못입력하였습니다. 다시 입력하세요.");
		}
	}

}
