package org.comstudy21.homework;

class Song{
	String title; // �뷡 ����
	String artist; // ����
	String album; // �ٹ� ����
	String composer; // �۰�� ���� �� ���� �� �ִ�.
	int year; // �뷡�� ��ǥ�� ����
	int track; // �뷡�� ���� �ٹ������� Ʈ����ȣ
	
	public Song() {
		
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void show() {
		System.out.println("�� �뷡�� " + "�۰ " + composer + "�� �۰��� " + 
				year + "�⵵�� �߸ŵ� " + artist + "�� "+ album + "�ٹ�, " + 
				track + "���� " + title + "�̶�� ���̴�.");
	}
}
public class Training01 {

	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen", "ABBA", "first", "ABBA", 1980, 1);
		
		s1.show();

	}

}
