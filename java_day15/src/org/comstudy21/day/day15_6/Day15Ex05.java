package org.comstudy21.day.day15_6;

import java.util.ArrayList;

class Music{
	public String Singer;
	public String Song;
	
	public Music(String Singer, String Song) {
		this.Singer = Singer;
		this.Song = Song;
	}
	public Music() {
		this("","");
	}
	public void setSinger(String Singer) {
		this.Singer = Singer;
	}
	public void setSong(String Song) {
		this.Song = Song;
	}

	void play() {
		System.out.println(Singer + "의  \"" + Song + "\" 실행");
	}
}

class MusicPlayer {
	ArrayList<Music> appendlist = new ArrayList<Music>();
	public void append(Music music) {
		appendlist.add(music);
		
	}

	public void autoPlay() {
		System.out.println();
		for(Music music : appendlist) {
			music.play();
		}
	}

}

public class Day15Ex05 {

	public static void main(String[] args) {
		Music m1 = new Music("조용필","바람의 노래");
		m1.play(); // 조용필의 바람의 노래 실행
		
		Music m2 = new Music();
		m2.setSinger("이선희");
		m2.setSong("아 옛날이여");
		m2.play(); // 이선희의 아 옛날이여 실행
		
		MusicPlayer mp = new MusicPlayer();
		mp.append(m1); // 배열, arraylist
		mp.append(m2);
		mp.append(new Music("이문세", "광화문연가"));
		mp.append(new Music("송골매", "하늘나라우리님"));
		
		mp.autoPlay(); // append 된 노래가 순서대로 출력된다.
		
	}

}
