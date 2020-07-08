package org.comstudy21.day13_4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class TestLotto {

	public static void main(String[] args) {
		HashSet lotto = new HashSet();
		
		Random rand = new Random();
		
		while(lotto.size() < 6) { //  현재 몇개가 있는지
			lotto.add( 1+rand.nextInt(45) );
		}
		
		
		System.out.println(lotto);
	}

}
