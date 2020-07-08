package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString(); // 문자열로 바꾸어서 
		System.out.println(strNow1);
		
		
		SimpleDateFormat format =
				new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String formatStr = format.format(now);
		System.out.println(formatStr);
	}
}
