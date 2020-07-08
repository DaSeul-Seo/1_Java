package org.comstudy21.library.allmain;

import java.util.ArrayList;
import org.comstudy21.library.model.MemberDto;

public class MainDao {
	private ArrayList<MemberDto> memberdtoList;
	private static int mseq = 100;
	
	public MainDao(ArrayList<MemberDto> memberdtoList) {
		this.memberdtoList = memberdtoList;
		this.memberdtoList.add(new MemberDto("1111","1111",mseq++,"kim","010-1234-1234","85.12.22"));
		this.memberdtoList.add(new MemberDto("2222","2222",mseq++,"lee","010-5666-6666","92.05.30"));
		this.memberdtoList.add(new MemberDto("3333","3333",mseq++,"park","010-9999-9999","01.09.11"));
		this.memberdtoList.add(new MemberDto("4444","4444",mseq++,"jang","010-8888-8888","94.10.01"));
	}
}
