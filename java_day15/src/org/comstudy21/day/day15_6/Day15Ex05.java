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
		System.out.println(Singer + "��  \"" + Song + "\" ����");
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
		Music m1 = new Music("������","�ٶ��� �뷡");
		m1.play(); // �������� �ٶ��� �뷡 ����
		
		Music m2 = new Music();
		m2.setSinger("�̼���");
		m2.setSong("�� �����̿�");
		m2.play(); // �̼����� �� �����̿� ����
		
		MusicPlayer mp = new MusicPlayer();
		mp.append(m1); // �迭, arraylist
		mp.append(m2);
		mp.append(new Music("�̹���", "��ȭ������"));
		mp.append(new Music("�۰��", "�ϴó���츮��"));
		
		mp.autoPlay(); // append �� �뷡�� ������� ��µȴ�.
		
	}

}
