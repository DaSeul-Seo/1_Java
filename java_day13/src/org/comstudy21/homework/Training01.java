package org.comstudy21.homework;

class Song{
	String title; // 노래 제목
	String artist; // 가수
	String album; // 앨범 제목
	String composer; // 작곡가는 여러 몇 있을 수 있다.
	int year; // 노래가 발표된 연도
	int track; // 노래가 속한 앨범에서의 트랙번호
	
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
		System.out.println("이 노래는 " + "작곡가 " + composer + "이 작곡한 " + 
				year + "년도에 발매된 " + artist + "의 "+ album + "앨범, " + 
				track + "번의 " + title + "이라는 곡이다.");
	}
}
public class Training01 {

	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen", "ABBA", "first", "ABBA", 1980, 1);
		
		s1.show();

	}

}
