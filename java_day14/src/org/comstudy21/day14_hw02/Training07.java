package org.comstudy21.day14_hw02;
/*ProductŬ������ �� ��ǰ�� ������ �ĺ���, ��ǰ����, ������, ���������� ����.
 * BookŬ�����z ISBN��ȣ, ����, å ���� ������ ����
 * CompactDiscŬ������ �ٹ�����, �����̸� ���� ����
 * ConversationBook�� ȸȭå���� �ٷ�� ���� ������ ����
 * ������ ����������, �ʵ�, �޼ҵ�, ������ ���� �ۼ�
 * ProductInfoŬ������ ����� �̰��� main�� �д�.
 * main()������ �ִ� 10���� ��ǰ�� �߰��� �� ������ ��� ��ǰ�� ������ ��ȸ�� �� �ִ�.
 * ��ǰ�� ���� ������ ����� �� ProductŸ���� ���۷����� �̿��϶�*/

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
		System.out.print("��ǰ����>> ");
		explan = scan.next();
		System.out.print("������>> ");
		producer = scan.next();
		System.out.print("����>> ");
		price = scan.nextInt();
		
	}
	
//	public Product( String explan, String producer, int price) {
//		this.explan = explan;
//		this.producer = producer;
//		this.price = price;
//	}
	public void showProduct() {
		System.out.println("��ǰ ����>> " + explan);
		System.out.println("������>> " + producer);
		System.out.println("����>> " + price);
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
		System.out.print("å ����>> ");
		booktitle = scan.next();
		System.out.print("����>> ");
		author = scan.next();
		System.out.print("ISBN>> ");
		isbn = scan.nextInt();
	}
	public void showProduct() {
		super.showProduct();
		System.out.println("å ����>> " + booktitle);
		System.out.println("����>> " + author);
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
		System.out.print("�ٹ�����>> ");
		albumtitle = scan.next();
		System.out.print("�����̸�>> ");
		singername = scan.next();
	}
	public void showProduct() {
		super.showProduct();
		System.out.println("�ٹ�����>> " + albumtitle);
		System.out.println("�����̸�>>  " + singername);	
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
		System.out.print("���>> ");
		language = scan.next();
	}
	public void showProduct() {
		super.showProduct();
		System.out.println("���>> " + language);	
	}
}

public class Training07 {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Product> list = new ArrayList<Product>();
	public static void main(String[] args) {
		while(true) {
			System.out.print("��ǰ�߰�<1>, ��� ��ǰ ��ȸ<2>, ������<3> >> ");
			int no = scan.nextInt();
			switch(no) {
			case 1: Input(list); break;
			case 2: Output(list); break;
			case 3:
				System.out.println("�����մϴ�.");
				System.exit(0);
			default : System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
	public static void Output(ArrayList<Product> p) {
		int id = 1;
		for(int i = 0; i<p.size(); i++) {
			System.out.println("===== ��ǰ" + id + " =====");
			p.get(i).showProduct();
			id++;
		}
	}
	public static void Input(ArrayList<Product> p) {
		System.out.print("��ǰ ����  å<1>, ����CD<2>, ȸȭå<3> >> ");
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
		default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

}
