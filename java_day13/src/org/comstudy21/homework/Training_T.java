package org.comstudy21.homework;

import java.util.ArrayList;

class Songs{
	String title;
	String artist;
	ArrayList<String> composer = new ArrayList<String>();
	String year;
	String track;
	
	public Songs() {}
	
	public Songs(String title, String artist) {
		this(title, artist, new String[] {""}, "","");
	}

	public Songs(String title, String artist,
			String[] composerArr, String year, String track) {
		this.title = title;
		this.artist = artist;
		if(composerArr == null) {
			composer = null;
		} else {
		for(String composer : composerArr) {
			this.composer.add(composer);
		}
		this.year = year;
		this.track = track;
		}
	}
	
	public void show() {
		System.out.println("title : " + title);
		System.out.println("artist : " + artist);
		System.out.print("composer: ");
		if(composer !=null) {
			for(int i = 0; i<composer.size(); i++) {
				System.out.print(composer.get(i));	
				if(i!=composer.size()-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		System.out.println("year : " + year);
		System.out.println("track : " + track);
	}
}
	
public class Training_T {

	public static void main(String[] args) {
		Songs song = new Songs("Dacing Queen", "ABBA", new String[] {"a","b","c"},"080101","ABBA Gold");
		song.show();
	}

}
