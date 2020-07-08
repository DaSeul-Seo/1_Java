package org.comstusy21.ch02;

public class Ch02Ex06 {
	
	public static void main(String[] args) {
		// Math.random() - 난수 발생기
		// 1보다 작은 소수점을 난수로 발생시킨다.
		double number = Math.random();
		System.out.println(1 + (int)(number * 100));
		
		System.out.println(5 + (int)Math.random()* 5);
		
		//70-100사이의 난수를 만들어 본다.
		System.out.println(70 + (int)Math.random() * 31);
		//71-100사이의 난수를 만들어 본다.
		System.out.println(71 + (int)Math.random() * 30);
		
		// 캐스팅 - 강제형변환
		// 변수와 데이터는 타입이 일치해야한다.(원칙)
		// 광역화(묵시적 형변환) : 컨파일러에 의해 자동 형변환 - 프로모션
		// 큰 타입의 변수에 작은 타입의 데어터를 대입할 때 일어난다.
		// 협소화(명시적 형변환) : 캐스트(괄호)연산자를 이용해서 형 변환 - 캐스팅
		// 작은 타입의 변수에 큰 타입의 데이터를 대입할 때 일어난다.
		int a = (int)100;
		int b = (int)3.14;
		float c = (float)3.14;
		
		double d = 10 * 3.14;
		double e = (double)10/3;  // 3.33333
		double f = (double)(10/3);  // 3.0
		System.out.println(e);
		System.out.println(f);
		
		
		// 문자열의 끝은 null로 표시된다.
		// "A" --- 실제로 두글자 [A][\0] *\0 = null 문자
		// 문자열 변수는 null이나 "" 초기화
		// null와 "" 는 의미가 다르다.
		String aStr = null;
		String bStr = "";
		
		System.out.println("aStr >>> " + aStr);
		System.out.println("bStr >>> " + bStr);
	}
	
	public static void text02(String[] args) {
		//test(null);
		int myAge = 1_234_567;
		long yourAge = 12L;
		
		double myHeight = 123.456789;
		float myWeught = 85.123456789F;
		
		double result = myAge + myHeight;
		
		char myBlood = 'A';
		myBlood += 1;  // myBlood = myBlood +1;
		
		boolean isTrue = true;
		isTrue = false;
		//isTrue = 100;
		
		System.out.println("isTrue => " + isTrue);
	}
	
	public static void test(String[] args) {
		int a = 1_000_000;
		// _는 자리수를 알아보기 쉽게 한 것.
		System.out.println(a);
		
	}

}
