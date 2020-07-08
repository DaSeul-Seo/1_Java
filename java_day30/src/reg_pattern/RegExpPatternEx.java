package reg_pattern;

import java.util.regex.Pattern;

public class RegExpPatternEx {
	public static void main(String[] args) {
		// 이메일 형식을 검사하는 정규표현식을 만들어 보세요.
		// \w == [a-zA-Z_0-9]
		String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data = "king@shop.com";
		if(args.length >= 1) {
			data = args[0];
		}
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println(data + "는(은) 올바른 형식입니다.");
		}else {
			System.out.println(data + "는(은) 바른 형식이 아닙니다.");
		}
	}

	public static void test01(String[] args) {
		// 정규표현식
		String regExp = "(02|010|054)-\\d{3,4}-\\d{4}";
		String data = "010-1234-5678";
		if(args.length >= 1) {
			data = args[0];
		}
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println(data + "는(은) 올바른 형식입니다.");
		}else {
			System.out.println(data + "는 (은) 바른 형식이 아닙니다.");
		}
	}
}
